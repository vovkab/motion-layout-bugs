package com.example.motionlayoutexample

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    lateinit var motion: MotionLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        motion = findViewById(R.id.motionLayout)
    }

    override fun onResume() {
        super.onResume()

        motion.transitionToState(R.id.end)
    }
}
