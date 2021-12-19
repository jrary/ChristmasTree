package org.techtown.christmastree

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.View.VISIBLE
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityTreeBinding

class TreeActivity : AppCompatActivity() {
    lateinit var binding: ActivityTreeBinding

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityTreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = Intent(this@TreeActivity, ResultActivity::class.java)


        setJwt(this, "top", "0")
        setJwt(this, "blink", "0")
        setJwt(this, "deco", "0")
        setJwt(this, "present", "0")

        binding.treeSubmitBtn.setOnClickListener{
            startActivity(result)
        }

        binding.treeStarItem.setOnClickListener{
            clickItem(binding.treeStarIv, "top")
        }
        binding.treeMerryChristmasItem.setOnClickListener{
            clickItem(binding.treeMerryChristmasIv, "top")
        }
        binding.treeDeco1Item.setOnClickListener{
            clickItem(binding.treeDeco1Iv,"blink")
        }
        binding.treeDeco2Item.setOnClickListener{
            clickItem(binding.treeDeco2Iv,"blink")
        }
        binding.treeDeco3Item.setOnClickListener{
            clickItem(binding.treeDeco3Iv,"blink")
        }
        binding.treeDeco4Item.setOnClickListener{
            clickItem(binding.treeDeco4Iv, "deco")
        }
        binding.treeDeco5Item.setOnClickListener{
            clickItem(binding.treeDeco5Iv,"blink")
        }
        binding.treeBallItem.setOnClickListener{
            clickItem(binding.treeBallIv, "deco")
        }
        binding.treeBellItem.setOnClickListener{
            clickItem(binding.treeBellIv, "deco")
        }
        binding.treeCandyItem.setOnClickListener{
            clickItem(binding.treeCandyIv, "deco")
        }
        binding.treePresent1Item.setOnClickListener{
            clickItem(binding.treePresent1Iv,"present")
        }
        binding.treePresent2Item.setOnClickListener{
            clickItem(binding.treePresent2Iv,"present")
        }
        binding.treePresent3Item.setOnClickListener{
            clickItem(binding.treePresent3Iv,"present")
        }
    }

    private fun clickItem(item: View, name: String){
        if(item.getVisibility() == View.VISIBLE){
            item.visibility = View.GONE
            removeJwt(this, name, "1")
        }
        else{
            item.visibility = View.VISIBLE
            addJwt(this, name, "1")
        }
    }
}