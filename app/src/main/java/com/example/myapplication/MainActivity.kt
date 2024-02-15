package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R.*
import android.view.View as View1


class MainActivity() : AppCompatActivity() , View.OnClickListener {

    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivision: Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTV: TextView

    constructor(parcel: Parcel) : this() {

    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        btnAdd = findViewById(id.btn_add)
        btnSub = findViewById(id.btn_subtraction)
        btnMultiply = findViewById(id.btn_multiplication)
        btnDivision = findViewById(id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTV = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMultiply.setOnClickListener(this)
        btnDivision.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add ->{
                result = a + b
            }
            R.id.btn_subtraction->{
                result = a - b
            }
            R.id.btn_multiplication->{
                result = a * b
            }
            R.id.btn_division->{
                result= a / b
            }
        }
        resultTV.text = "Result is $result"
    }
}
