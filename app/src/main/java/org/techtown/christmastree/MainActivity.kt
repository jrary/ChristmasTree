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

        song = MediaPlayer.create(this, R.raw.next_winter)
        song.start()


        val tree = Intent(this@MainActivity, TreeSplashActivity::class.java)
        val cookie = Intent(this@MainActivity, CookieActivity::class.java)
        val more = Intent(this@MainActivity, MoreActivity::class.java)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://forms.gle/GqzDWBcWUAX8EmB69"))

        binding.mainTreeBtn.setOnClickListener{
            startActivity(tree)
        }
        binding.mainCookieBtn.setOnClickListener{
            startActivity(cookie)
        }
        binding.mainMoreBtn.setOnClickListener{
            startActivity(more)
        }
        binding.mainFeedbackBtn.setOnClickListener{
            startActivity(intent)
        }
    }
}