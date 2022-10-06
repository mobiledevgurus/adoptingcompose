package com.mobiledevgurus.adoptingcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.ui.platform.ComposeView
import com.mobiledevgurus.adoptingcompose.ui.theme.AdoptingComposeTheme

class ComposeAndXmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compose_and_xml)

        val greeting = findViewById<ComposeView>(R.id.greeting)
        greeting.setContent {
            // You can set any composable you want to demonstrate I just reused the composable
            // that I created on the ComposedActivity.
            AdoptingComposeTheme {
                HelloWorldLabel()
            }
        }
    }
}