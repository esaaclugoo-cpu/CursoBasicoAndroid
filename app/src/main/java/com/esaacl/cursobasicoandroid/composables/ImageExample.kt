package com.esaacl.cursobasicoandroid.composables

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.esaacl.cursobasicoandroid.R


@Preview
@Composable

fun ImageExample(){

    Image(painter = painterResource(id = R.drawable.ic_launcher_background ),
        contentDescription = "User Avatar"
    )


}