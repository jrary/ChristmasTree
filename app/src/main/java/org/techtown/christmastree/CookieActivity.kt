package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityCookieBinding
import java.util.*

class CookieActivity : AppCompatActivity() {
    lateinit var binding: ActivityCookieBinding

    var fortuneMessage = arrayOf(
            "대학원에 가게 됩니다",
            "매우 행복할 것입니다",
            "놀기만 합니다",
            "크게 성공할 것입니다",
            "일만 열심히 합니다",
            "자퇴를 합니다",
            "잠을 잡니다",
            "취업에 성공합니다",
            "공부를 열심히 합니다",
            "맛있는 것을 많이 먹습니다"
    )

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityCookieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cookie1Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie2Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie3Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie4Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie5Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie6Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie7Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie8Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie9Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie10Iv.visibility = View.GONE
        }
        binding.cookie10Iv.setOnClickListener {
            binding.cookieMessageTv.text = fortuneMessage[setRandom()]
            binding.cookie1Iv.visibility = View.GONE
            binding.cookie2Iv.visibility = View.GONE
            binding.cookie3Iv.visibility = View.GONE
            binding.cookie4Iv.visibility = View.GONE
            binding.cookie5Iv.visibility = View.GONE
            binding.cookie6Iv.visibility = View.GONE
            binding.cookie7Iv.visibility = View.GONE
            binding.cookie8Iv.visibility = View.GONE
            binding.cookie9Iv.visibility = View.GONE
        }

        binding.cookieRetryBtn.setOnClickListener {
            finish()
            val cookie = Intent(this@CookieActivity, CookieActivity::class.java)
            startActivity(cookie)
        }
        binding.cookieHomeBtn.setOnClickListener {
            finish()
        }
    }

    private fun setRandom(): Int{
        val random = Random()
        return random.nextInt(9)
    }
}