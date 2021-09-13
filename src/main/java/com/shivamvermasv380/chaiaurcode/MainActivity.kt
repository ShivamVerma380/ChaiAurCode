package com.shivamvermasv380.chaiaurcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var textView:TextView?= null
    var text: String?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.Name)
    }
    fun getBack(view: android.view.View){
       setContentView(R.layout.activity_main)
       textView = findViewById(R.id.Name)
    }
    fun clicking_Yes(view: android.view.View) {
        setContentView(R.layout.chai_code)
        var str:String= textView?.editableText.toString()
        text = "Hello $str,\n As you Love Coding then\n Chai Piyo,Coding Karo Aur Paise Kamao!!"
        var tV: TextView = findViewById(R.id.Successful)
        tV.append(text)
        Toast.makeText(this,"$str",Toast.LENGTH_LONG).show()
    }

    fun clicking_No(view: android.view.View) {
        setContentView(R.layout.chai_biscuit)
        var str:String= textView?.editableText.toString()
        text = "Hello $str,\n As you Don't Love Coding then\n Chai Piyo,Biscuit Khao!!"
        var tV: TextView = findViewById(R.id.Jhetalal)
        tV.append(text)
        Toast.makeText(this,"$str",Toast.LENGTH_LONG).show()
    }
}