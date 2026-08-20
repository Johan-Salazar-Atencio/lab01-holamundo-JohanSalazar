package com.salazar.lab00

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.salazar.lab00.ui.theme.Lab00Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.ui.text.font.FontWeight

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab00Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Johan",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "¡Hola, soy $name!", fontSize = 24.sp)
        Text(text = "Curso: Programación en Móviles", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        Button(onClick = { }) {Text("Presioname")}
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab00Theme {
        Greeting("Johan")
    }
}