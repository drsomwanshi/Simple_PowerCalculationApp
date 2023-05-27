package com.example.powercal2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cal(view: View) {

        var txt1=findViewById(R.id.txt1) as EditText
        var txt2=findViewById(R.id.txt2) as EditText
        var txt3=findViewById(R.id.txt3) as EditText
        var n1=txt1.text.toString().toDouble();
        var n2=txt2.text.toString().toDouble();
        var ans=Math.pow(n1,n2)
        txt3.setText("" + ans);
    }
}