package com.ajsherrell.sunset

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //use Kotlin Android Extensions instead here
//    private lateinit var sceneView: View
//    private lateinit var sunView: View
//    private lateinit var skyView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //use Kotlin Android Extensions instead here
//        sceneView = findViewById(R.id.scene)
//        sunView = findViewById(R.id.sun)
//        skyView = findViewById(R.id.sky)
    }

    private fun startAnimation() {
        val sunYStart = sun.top.toFloat()
        val sunYEnd = sky.height.toFloat()

        val heightAnimator = ObjectAnimator
            .ofFloat(sun, "y", sunYStart, sunYEnd)
            .setDuration(3000)

        heightAnimator.start()
    }
}
