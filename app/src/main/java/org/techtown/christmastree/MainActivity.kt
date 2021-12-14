package org.techtown.christmastree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.christmastree.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tree = Intent(this@MainActivity, TreeSplashActivity::class.java)

        val cookie = Intent(this@MainActivity, CookieActivity::class.java)

        binding.mainTreeBtn.setOnClickListener{
            startActivity(tree)
        }

        binding.mainCookieBtn.setOnClickListener{
            startActivity(cookie)
        }
    }
}