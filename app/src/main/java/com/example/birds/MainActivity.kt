package com.example.birds

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.graphics.Color.blue
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.graphics.toColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRed = findViewById<Button>(R.id.btn_red)
        val btnBlue = findViewById<Button>(R.id.btn_blue)
        val btnGreen = findViewById<Button>(R.id.btn_green)
        val btnBlack = findViewById<Button>(R.id.btn_black)
        val tv = findViewById<TextView>(R.id.tv)
        val btnRst = findViewById<Button>(R.id.btn_rst)

        val sharedPreferences = getSharedPreferences("prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()
        var numberOfBirds = sharedPreferences.getInt("NumberOfBirds", 0)
        tv.setBackgroundColor(Color.parseColor(sharedPreferences.getString("Color", "#ffffff")))

        btnRst.setOnClickListener{
            numberOfBirds = 0
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor("#ffffff"))
            editor.apply{
                putInt("NumberOfBirds", numberOfBirds)
                putString("Color", "#ffffff")
            }.apply()
        }

        btnRed.setOnClickListener{
            numberOfBirds ++
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor("#ff0000"))
            editor.apply{
                putInt("NumberOfBirds", numberOfBirds)
                putString("Color", "#ff0000")
            }.apply()
        }

        btnBlue.setOnClickListener{
            numberOfBirds ++
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor("#0000ff"))
            editor.apply{
                putInt("NumberOfBirds", numberOfBirds)
                putString("Color", "#0000ff")
            }.apply()
        }

        btnGreen.setOnClickListener{
            numberOfBirds ++
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor("#00ff00"))
            editor.apply{
                putInt("NumberOfBirds", numberOfBirds)
                putString("Color", "#00ff00")
            }.apply()
        }

        btnBlack.setOnClickListener{
            numberOfBirds ++
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor("#000000"))
            editor.apply{
                putInt("NumberOfBirds", numberOfBirds)
                putString("Color", "#000000")
            }.apply()
        }

        fun loadData(){
            val numberOfBirds = sharedPreferences.getInt("NumberOfBirds", 0)
            val bgColor = sharedPreferences.getString("Color", "#ffffff")
            tv.setText(numberOfBirds.toString())
            tv.setBackgroundColor(Color.parseColor(bgColor))
    }
        loadData()


    }

}