package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.function.DoublePredicate
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt :EditText = findViewById(R.id.kilo_edt)
        val btn:Button = findViewById(R.id.btn)
        val result: TextView = findViewById(R.id.result_txt)
        //TODO - convert from kilos to grams
        btn.setOnClickListener {
            val kilos:Double = edt.text.toString().toDouble()
            result.setText("  "+ convertToPounds(kilos) + "\nPounds")
        }
    }

    fun convertToPounds(kilos:Double):Double{
        var pounds = (kilos * 2.20462).roundToInt()/100.0

        return pounds
    }
}