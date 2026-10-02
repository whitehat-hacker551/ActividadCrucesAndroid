package com.example.actividad1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad1.ui.theme.Actividad1Theme
import com.example.actividad1.ui.theme.Purple40

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
             BoxCruces()
        }
    }
}
@Composable
fun BoxCruces() {
    Box(
        modifier = Modifier.fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp),

        contentAlignment = Alignment.Center

    ) {
        Text(
            text = "X",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopStart)

        )
        Text(
            text = "+",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.TopCenter)
        )
        Text(
            text = "+",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.CenterStart)
        )
        Text(
            text = "+",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.CenterEnd)
        )
        Text(
            text = "X",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.BottomStart)
        )
        Text(
            text = "+",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.BottomCenter)
        )
        Text(
            text = "X",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.BottomEnd)
        )
        Text(
            text = "X",
            fontSize = 30.sp,
            modifier= Modifier.align(Alignment.TopEnd)
        )

    }
}
