package com.example.buttoncounter

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : ComponentActivity() {
    private var button: Button? = null
    private var textView: TextView? = null
    private var x2Button: Button? = null
    private var x3Button: Button? = null
    private var x4Button: Button? = null
    private var resetButton: Button? = null
    private var timesClicked = 0
    private var multiplier = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        x2Button = findViewById<Button>(R.id.x2Button)
        x3Button = findViewById<Button>(R.id.x3Button)
        x4Button = findViewById<Button>(R.id.x4Button)
        resetButton = findViewById<Button>(R.id.resetButton)
        textView = findViewById<TextView>(R.id.textView)

        button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                timesClicked += 1 * multiplier

                // Grammar check based on singular and multiple cookies
                if (timesClicked == 1) {
                    textView?.text = "You currently have $timesClicked cookie"
                }
                else {
                    textView?.text = "You currently have $timesClicked cookies"
                }
            }
        })

        x2Button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {

                if (timesClicked > 99)
                {
                    timesClicked -= 100
                    multiplier += 1
                    textView?.text = "You currently have $timesClicked cookies"
                }
            }
        })

        x3Button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {

                if (timesClicked > 999)
                {
                    timesClicked -= 1000
                    multiplier += 10
                    textView?.text = "You currently have $timesClicked cookies"
                }
            }
        })

        x4Button?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {

                if (timesClicked > 4999)
                {
                    timesClicked -= 5000
                    multiplier += 100
                    textView?.text = "You currently have $timesClicked cookies"
                }
            }
        })

        resetButton?.setOnClickListener(object: View.OnClickListener {
            override fun onClick(p0: View?) {
                timesClicked === 0
                multiplier === 0
                textView?.text = "You currently have $timesClicked cookies"
            }
        })
    }
}
