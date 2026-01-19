package com.bharat.flashcardquizapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import com.bharat.flashcardquizapp.R;

public class MainActivity extends AppCompatActivity {

    String[] questions = {
            "Capital of India?",
            "Founder of Java?",
            "2 + 2 = ?"
    };

    String[] answers = {
            "New Delhi",
            "James Gosling",
            "4"
    };

    int index = 0, score = 0;

    TextView questionText;
    EditText answerInput;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionText = findViewById(R.id.questionText);
        answerInput = findViewById(R.id.answerInput);
        submitBtn = findViewById(R.id.submitBtn);

        questionText.setText(questions[index]);

        submitBtn.setOnClickListener(v -> {
            if (answerInput.getText().toString()
                    .equalsIgnoreCase(answers[index])) {
                score++;
            }

            index++;
            answerInput.setText("");

            if (index < questions.length) {
                questionText.setText(questions[index]);
            } else {
                questionText.setText(
                        "Final Score: " + score + "/" + questions.length
                );
                submitBtn.setEnabled(false);
            }
        });
    }
}
