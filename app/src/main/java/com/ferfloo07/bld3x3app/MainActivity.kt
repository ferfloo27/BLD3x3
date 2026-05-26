package com.ferfloo07.bld3x3app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ferfloo07.bld3x3app.presentation.on_boarding.OnBoardingScreen
import com.ferfloo07.bld3x3app.ui.theme.Bld3x3AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Bld3x3AppTheme {
                //WelcomeScreen()
                OnBoardingScreen()
            }
        }
    }
}

