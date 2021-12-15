package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityTreeBinding

class TreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityTreeBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityTreeBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }

    fun chooseItem(){

    }


}