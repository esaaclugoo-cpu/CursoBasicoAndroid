package com.esaacl.cursobasicoandroid.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ProfileScreen(){
    Row(modifier = Modifier.padding(horizontal = 22.dp, vertical = 40.dp)
        .fillMaxHeight()
        .background(Color.Blue)

    ){

        Column{
        Text("AristiDevs")
        Text("Mobile Developer")
        }
          Button(onClick = {}){

              Text("Follow")
          }
    }

}















