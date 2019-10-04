package com.polotechnologies.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage = findViewById<ImageView>(R.id.imageDice)
        val button = findViewById<MaterialButton>(R.id.rollButton)

        button.setOnClickListener {
            val randomInt = Random.nextInt(6) + 1

            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            diceImage.setImageResource(drawableResource)

        }
    }
}
