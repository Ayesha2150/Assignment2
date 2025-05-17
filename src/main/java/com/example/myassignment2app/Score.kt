package com.example.myassignment2app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ScoreActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId" , "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        val reviewTextView = findViewById<TextView>(R.id.reviewTextView)
        val tryAgainButton = findViewById<Button>(R.id.tryAgainButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        val score = intent.getIntExtra("score", 0)
        scoreTextView.text = "Your Score: $score out of 5"

        reviewTextView.text = """
            1. World War I began in 1914.
            2. The Roman Empire fell in 1066.
            3. The Great Wall of China was built in a single year.
            4. Nelson Mandela was South Africa’s first Black president.
            5. The Berlin Wall fell in 1989.
        """.trimIndent()

        tryAgainButton.setOnClickListener {
            Toast.makeText(this, "Restarting the quiz...!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
            finish()
        }

        exitButton.setOnClickListener {
            Toast.makeText(this, "Thanks for playing!", Toast.LENGTH_SHORT).show()
            finishAffinity()
        }
    }
}

