Introduction
This is a simple Android quiz application developed using Kotlin and Android Studio. The app presents users with a set of true/false historical questions, tracks their score and provides feedback and a review after the quiz.

 Features
- Multiple true/false questions on history
- Instant feedback after each answer
- Score tracking and display at the end
- Option to review all questions
- Try again or exit functionality
- 
 Activities
• MainActivity: Entry point of the app, where the quiz begins.
• QuestionActivity: Displays each question, processes answers, and navigates to the next question.
• ScoreActivity: Shows the final score and review of questions with options to retry or exit.

 Layout Files
• activity_main.xml - Layout for MainActivity.
• activity_question.xml - Layout for QuestionActivity, includes question text, answer buttons, feedback, and next button.
• activity_score.xml - Layout for ScoreActivity, shows score, review questions, and action buttons.

 How to Run the App
1. Open the project in Android Studio.
2. Build and run the application on an emulator or physical Android device.
3. Navigate through the app starting from MainActivity.
   
6. Technologies Used
- Kotlin
- Android SDK
- ConstraintLayout for responsive UI
