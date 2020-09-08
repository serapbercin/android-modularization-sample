package com.serapbercin.modularization

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.serapbercin.modularization.di.MainComponentProvider
import com.serapbercin.modularization.ui.FirstTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (applicationContext as MainComponentProvider)
            .getMainComponentProvider()
            .mainActivity(this)
            .build()
            .inject(this)

        setContent {
            FirstTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "$name Jetpack compose playground!")
}

@Preview(showBackground = true, name = "Text preview")
@Composable
fun DefaultPreview() {
    FirstTheme {
        Greeting("Android Compose Sample")
    }
}
