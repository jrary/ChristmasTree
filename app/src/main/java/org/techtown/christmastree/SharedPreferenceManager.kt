package org.techtown.christmastree

import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import java.lang.NumberFormatException

fun setJwt(context: Context, name: String,  jwt: String) {
    val spf = context.getSharedPreferences(name, AppCompatActivity.MODE_PRIVATE)
    val editor = spf.edit()
    editor.putString("jwt", jwt)
    editor.apply()
}
fun addJwt(context: Context, name: String,  jwt: String) {
    val spf = context.getSharedPreferences(name, AppCompatActivity.MODE_PRIVATE)
    val editor = spf.edit()

    var num: Int? = getJwt(context, name).toIntOrNull()
    num = num?.plus(jwt.toInt())

    editor.putString("jwt", num.toString())
    editor.apply()
}
fun removeJwt(context: Context, name: String,  jwt: String) {
    val spf = context.getSharedPreferences(name, AppCompatActivity.MODE_PRIVATE)
    val editor = spf.edit()

    var num: Int? = getJwt(context, name).toIntOrNull()
    num = num?.minus(jwt.toInt())

    editor.putString("jwt", num.toString())
    editor.apply()
}

fun getJwt(context: Context, name: String): String{
    val spf = context.getSharedPreferences(name, AppCompatActivity.MODE_PRIVATE)

    return spf.getString("jwt", "")!!
}