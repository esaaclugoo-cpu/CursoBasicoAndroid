package com.esaacl.cursobasicoandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.esaacl.cursobasicoandroid.composables.ButtonExample
import com.esaacl.cursobasicoandroid.composables.ImageExample
import com.esaacl.cursobasicoandroid.composables.ProfileScreen
import com.esaacl.cursobasicoandroid.composables.TextExample
import com.esaacl.cursobasicoandroid.ui.theme.CursoBasicoAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CursoBasicoAndroidTheme {
                ProfileScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Example() {
    Text(text = "Hola, es una prueba", fontSize =40.sp)

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
    CursoBasicoAndroidTheme {
        Greeting("Android")
    }
}