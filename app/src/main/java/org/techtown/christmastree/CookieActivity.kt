package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityCookieBinding
import org.techtown.christmastree.databinding.ActivityTreeBinding

class CookieActivity : AppCompatActivity() {
    lateinit var binding: ActivityCookieBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityCookieBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}