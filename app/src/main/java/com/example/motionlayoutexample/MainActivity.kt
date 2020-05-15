package com.example.motionlayoutexample

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        Handler().postDelayed(
            { findViewById<View>(R.id.customlayout).visibility = View.GONE },
            2000
        )
    }
}
