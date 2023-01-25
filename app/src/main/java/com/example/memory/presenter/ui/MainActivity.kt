package com.example.memory.presenter.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.memory.domain.entities.Hero
import com.example.memory.presenter.ui.theme.MemoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MemoryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Board(heroCards = listOf(
                        Hero(1),
                        Hero(2),
                        Hero(3),
                        Hero(4),
                        Hero(5),
                        Hero(6),
                        Hero(7),
                        Hero(8),
                        Hero(9),
                        Hero(10),
                        Hero(11),
                        Hero(12),
                        Hero(13),
                        Hero(14),
                        Hero(15),
                        Hero(16),
                        Hero(17),
                        Hero(18),
                        Hero(19),
                        Hero(20),
                    ))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MemoryTheme {
        Greeting("Android")
    }
}