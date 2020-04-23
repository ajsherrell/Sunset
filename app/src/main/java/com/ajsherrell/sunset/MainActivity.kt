package com.ajsherrell.sunset

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //use Kotlin Android Extensions instead here
//    private lateinit var sceneView: View
//    private lateinit var sunView: View
//    private lateinit var skyView: View

    private val blueSkyColor: Int by lazy {
        ContextCompat.getColor(this, R.color.blue_sky)
    }
    private val sunsetSkyColor: Int by lazy {
        ContextCompat.getColor(this, R.color.sunset_sky)
    }
    private val nightSkyColor: Int by lazy {
        ContextCompat.getColor(this, R.color.night_sky)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //use Kotlin Android Extensions instead here
//        sceneView = findViewById(R.id.scene)
//        sunView = findViewById(R.id.sun)
//        skyView = findViewById(R.id.sky)

        //when user presses anywhere in the scene view
        scene.setOnClickListener {
            startAnimation()
        }
    }

    private fun startAnimation() {
        val sunYStart = sun.top.toFloat()
        val sunYEnd = sky.height.toFloat()

        val heightAnimator = ObjectAnimator
            .ofFloat(sun, "y", sunYStart, sunYEnd)
            .setDuration(3000)
        heightAnimator.interpolator = AccelerateInterpolator()

        val sunsetSkyAnimator = ObjectAnimator
            .ofInt(sky, "backgroundColor", blueSkyColor, sunsetSkyColor)
            .setDuration(3000)

        heightAnimator.start()
        sunsetSkyAnimator.start()
    }
}
