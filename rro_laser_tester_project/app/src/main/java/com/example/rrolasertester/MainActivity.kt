package com.example.rrolasertester

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var currentValue by remember { mutableStateOf(0) }
            var measurements by remember { mutableStateOf(listOf<Int>()) }
            Scaffold(
                topBar = { TopAppBar(title = { Text("RRO laser tester") }) },
                content = {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Valore: ${currentValue} mm", style = MaterialTheme.typography.h4)
                        Spacer(modifier = Modifier.height(16.dp))
                        Row {
                            Button(onClick = { measurements = measurements + currentValue }, modifier = Modifier.weight(1f)) {
                                Text("Registra")
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            Button(onClick = { /* Navigate to summary */ }, modifier = Modifier.weight(1f)) {
                                Text("Stop/Salva")
                            }
                        }
                    }
                }
            )
        }
    }
}
