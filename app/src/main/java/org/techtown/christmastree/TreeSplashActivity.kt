package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class TreeSplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_tree)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, TreeActivity::class.java))
            finish()
        }, 5000)

    }

}