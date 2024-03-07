package com.user.guess


import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.user.guess.com.user.guess.SecretNumber
import com.user.guess.com.user.guess.view


class MainActivity  : AppCompatActivity () {
    val secrtNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiy_main_xml)
        Log.d("MainAvtivity","secret:"+secretnumber.secret)
    }
    fun check(view : view) {
        val n = number.text.toString().toInt()
        println("number: $n")
        Log.d("MainActivity", "number" + n)
        val diff:Int-secretnumber.validate(n) )
        var message:"yes"
        if (diff< 0){
            message = "Bigger"
        } else if(diff>0) {
              message = "Smaller"
        }
        //Toast.makeText(this,message, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("message")
            .setMessage("message")
            .setPositiveButton("ok",null)
            .show()

    }
}
