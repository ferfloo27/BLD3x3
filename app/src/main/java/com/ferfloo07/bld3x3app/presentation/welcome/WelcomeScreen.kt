package com.ferfloo07.bld3x3app.presentation.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.ferfloo07.bld3x3app.R
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        HeaderWelcome()
        ContentWelcome()
    }
}

@Composable
fun ColumnScope.HeaderWelcome() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "3x3 BLD Rubik", fontSize = 36.sp)
            Spacer(Modifier.height(12.dp))
            Text(text = "La practica hace al maestro")
        }


    }
}

@Composable
fun ColumnScope.ContentWelcome() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .weight(1f),
        contentAlignment = Alignment.BottomCenter

    ) {
        Image(
            painter = painterResource(R.drawable.fonde_welcome),
            contentDescription = "cubes_images",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Button(
            onClick = {},
            Modifier.padding(bottom = 60.dp)
        ) {
            Text(text = "Comenzar", fontWeight = FontWeight.Bold)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}