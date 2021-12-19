package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityCookieBinding
import org.techtown.christmastree.databinding.ActivityMoreBinding
import java.util.*

class MoreActivity : AppCompatActivity() {
    lateinit var binding: ActivityMoreBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMoreBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}