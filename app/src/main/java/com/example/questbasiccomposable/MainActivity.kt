package com.example.questbasiccomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable.ui.theme.QuestBasicComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposableTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    QuestBasicComposable(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun QuestBasicComposable(modifier: Modifier = Modifier ){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 50.dp)) {
        Text("Login",
            fontSize = 75.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(2.dp))
        Text("Ini Adalah Halaman Login")

        Spacer(modifier = Modifier.padding(7.dp))

        Image(painter = painterResource(id = R.drawable.umy),
            contentDescription = "",
            modifier = Modifier.size(275.dp))

        Spacer(modifier = Modifier.padding(1.dp))

        Text("Nama",
            fontSize = 25.sp)
        Text("Muhamad Hilal Fakhri")
        Text("20220140151",
            fontSize = 30.sp)

        Spacer(modifier = Modifier.padding(5.dp))

        Image(painter = painterResource(id = R.drawable.foto),
            contentDescription = "",
            modifier = Modifier.size(250.dp)
                .clip(RoundedCornerShape(50.dp)))

    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposableTheme {
        QuestBasicComposable()
    }
}