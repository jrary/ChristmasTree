package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityCookieBinding
import org.techtown.christmastree.databinding.ActivityMoreBinding
import org.techtown.christmastree.databinding.ActivityResultBinding
import org.techtown.christmastree.databinding.ActivityTreeBinding

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}