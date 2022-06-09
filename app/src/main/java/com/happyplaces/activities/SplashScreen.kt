package com.happyplaces.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.happyplaces.R

class SplashScreen : AppCompatActivity() {

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


            // This is used to hide the status bar and make
            // the splash screen full-screen activity.
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

            // HERE WE ARE TAKING THE REFERENCE OF OUR IMAGE
            // SO THAT WE CAN PERFORM ANIMATION USING THAT IMAGE
            val backgroundImage: ImageView = findViewById(R.id.SplashScreenImage)
            val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
            backgroundImage.startAnimation(slideAnimation)

            // we used the postDelayed(Runnable, time) method
            // to send a message with a delayed time.
            Handler().postDelayed({
                val intent = Intent(this, ClusterItemActivity::class.java)
                startActivity(intent)
                finish()
            }, 1500) // 1500 is the delayed time in milliseconds.

    }
}
