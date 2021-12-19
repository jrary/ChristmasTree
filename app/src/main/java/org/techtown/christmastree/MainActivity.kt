package org.techtown.christmastree

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
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

        song = MediaPlayer.create(this, R.raw.christmas_overture)
        song.start()


        val tree = Intent(this@MainActivity, TreeSplashActivity::class.java)
        val cookie = Intent(this@MainActivity, CookieActivity::class.java)
        val feedback = Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/P8DnnVkkU6DE3hrs9"))
        val more = Intent(this@MainActivity, MoreActivity::class.java)

        binding.mainTreeBtn.setOnClickListener{
            tree.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(tree)
        }
        binding.mainCookieBtn.setOnClickListener{
            startActivity(cookie)
        }
        binding.mainFeedbackTv.setOnClickListener{
            startActivity(feedback)
        }
        binding.mainSourcesTv.setOnClickListener{
            startActivity(more)
        }
    }
}