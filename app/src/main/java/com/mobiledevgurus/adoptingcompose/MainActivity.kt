package com.mobiledevgurus.adoptingcompose

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        attachActions()
    }

    private fun attachActions() {
        val composeBaseBtn = findViewById<Button>(R.id.composeBased)
        val composeOnXmlBtn = findViewById<Button>(R.id.composeXml)
        val xmlOnComposeBtn = findViewById<Button>(R.id.xmlOnCompose)

        composeBaseBtn.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ComposeBasedActivity::class.java
                )
            )
        }

        composeOnXmlBtn.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ComposeAndXmlActivity::class.java
                )
            )
        }

        xmlOnComposeBtn.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ViewOnComposeActivity::class.java
                )
            )
        }
    }
}