package com.example.myassignment2app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


        data class Question(val text: String, val isTrue: Boolean)

        class QuestionActivity : AppCompatActivity() {

            private val questions = listOf(
                Question("World War I began in 1914.", true),
                Question("The Roman Empire fell in 1066.", false),
                Question("The Great Wall of China was built in a single year.", false),
               Question( "Nelson Mandela was South Africa’s first Black president.", true),
               Question( "The Berlin Wall fell in 1989.", true)
            )

            private var currentQuestionIndex = 0
            private var score = 0

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_question)

                val questionTextView = findViewById<TextView>(R.id.questionTextView)
                val feedbackTextView = findViewById<TextView>(R.id.feedbackTextView)
                val trueButton = findViewById<Button>(R.id.trueButton)
                val falseButton = findViewById<Button>(R.id.falseButton)
                val nextQuestionButton = findViewById<Button>(R.id.nextButton)

                fun showQuestion() {
                    val question = questions[currentQuestionIndex]
                    questionTextView.text = question.text
                    feedbackTextView.text = ""
                    trueButton.isEnabled = true
                    falseButton.isEnabled = true
                }

                fun checkAnswer(userAnswer: Boolean) {
                    val correctAnswer = questions[currentQuestionIndex].isTrue
                    if (userAnswer == correctAnswer) {
                        feedbackTextView.text = "Correct answer"
                        score++
                    } else {
                        feedbackTextView.text = "Incorrect answer"
                    }
                    trueButton.isEnabled = false
                    falseButton.isEnabled = false
                }

                trueButton.setOnClickListener {
                    checkAnswer(true)
                }

                falseButton.setOnClickListener {
                    checkAnswer(false)
                }

                nextQuestionButton.setOnClickListener {
                    currentQuestionIndex++
                    if (currentQuestionIndex < questions.size) {
                        showQuestion()
                    } else {
                        Toast.makeText(this, "Quiz finished. Navigating to score screen...", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, ScoreActivity::class.java)
                        intent.putExtra("score", score)
                        startActivity(intent)
                        finish()
                    }
                }

                showQuestion()
            }
        }



