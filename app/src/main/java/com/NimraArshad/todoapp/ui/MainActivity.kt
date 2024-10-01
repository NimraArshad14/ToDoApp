package com.NimraArshad.todoapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.NimraArshad.todoapp.ui.components.TopNavBar
import com.NimraArshad.todoapp.ui.theme.ToDoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ToDoAppTheme {
                Scaffold (

                    topBar = { TopNavBar() },

                    modifier = Modifier
                        .fillMaxSize()
                ) {
                        innerPadding ->
                    App(innerPadding = innerPadding)
                 }
            }
        }
    }


}