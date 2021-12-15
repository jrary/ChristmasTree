package org.techtown.christmastree

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.christmastree.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private lateinit var song: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        song = MediaPlayer.create(this, R.raw.next_winter)
        song.start()


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