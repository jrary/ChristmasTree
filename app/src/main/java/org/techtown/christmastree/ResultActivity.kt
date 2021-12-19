package org.techtown.christmastree

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.techtown.christmastree.databinding.ActivityResultBinding
import java.util.*

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding

    private var top: Int = 0
    private var deco: Int = 0
    private var blink: Int = 0
    private var present: Int = 0
    var compScore: Int = 0
    var satiScore: Int = 0
    var finalScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        top = getJwt(this, "top").toInt()
        deco = getJwt(this, "deco").toInt()
        blink = getJwt(this, "blink").toInt()
        present = getJwt(this, "present").toInt()

        compScore=getCompScore(top, deco, blink, present)
        satiScore=getSatiScore(top, deco, blink, present)
        finalScore = (compScore+satiScore)/2

        binding.resultCompScoreTv.text = compScore.toString()
        binding.resultSatiScoreTv.text = satiScore.toString()
        binding.resultFinalScoreTv.text = finalScore.toString()
        getComment(finalScore)
        binding.resultCommentTv.text = getComment(finalScore)

        val tree = Intent(this@ResultActivity, TreeActivity::class.java)

        binding.resultRetryBtn.setOnClickListener {
            multiFinish()
            startActivity(tree)
        }
        binding.resultHomeBtn.setOnClickListener {
            multiFinish()
        }
    }

    private fun multiFinish() {
        this@ResultActivity.finishAffinity()
    }

    //top: 0=3 1=10 2=-22
    //deco: 0=0 1=4 2=20 3=40 4=30
    //blink: 0=5 1=9 2=15 3=20 4=23
    //present: 0=0 1=5 2=10 3=27
    private fun getCompScore(top: Int, deco: Int, blink: Int, present: Int): Int{
        var score: Int = 0
        when (top) {
            0 -> score += 3
            1 -> score += 10
            2 -> score -= 22
            else -> Log.d("SCORE ERROR", "wrong value in - top")
        }
        when (deco) {
            0 -> score += 0
            1 -> score += 4
            2 -> score += 20
            3 -> score += 40
            4 -> score += 30
            else -> Log.d("SCORE ERROR", "wrong value in - deco")
        }
        when (blink) {
            0 -> score += 5
            1 -> score += 9
            2 -> score += 15
            3 -> score += 20
            4 -> score += 23
            else -> Log.d("SCORE ERROR", "wrong value in - blink")
        }
        when (present) {
            0 -> score += 0
            1 -> score += 5
            2 -> score += 10
            3 -> score += 27
            else -> Log.d("SCORE ERROR", "wrong value in - present")
        }
        Log.d("COMP SCORE", score.toString())
        return score
    }

    private fun getSatiScore(top: Int, deco: Int, blink: Int, present: Int): Int{
        var score = 0
        val random = Random()
        score += (top+deco+blink+present)*4

        if(top>0) score += 10
        if(deco>0) score += 10
        if(blink>0) score += 10
        if(present>0) score += 10

        score += random.nextInt(8)
        Log.d("SATI SCORE", score.toString())
        return score
    }

    private fun getComment(score: Int): String{
        lateinit var message: String
        when (score/10){
            0, 1, 2, 3, 4 -> message = "오늘의 트리 꾸미기는\n 좀 실망인걸~"
            5, 6 -> message = "예쁘게 꾸며줘서 고마워~"
            7, 8 -> message = "오늘의 트리 꾸미기는\n 환상이야~"
            9, 10 -> message = "당신을 저의 트리\n 꾸미기 전속 아티스트로\n 임명합니다~"
            else -> Log.d("SCORE ERROR", score.toString())
        }
        return message
    }
}