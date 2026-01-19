package com.bharat.randomquotegenerator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView quoteText;
    Button generateBtn;

    String[] quotes = {
            "Believe in yourself.",
            "Dream big and work hard.",
            "Consistency is the key to success.",
            "Every day is a new opportunity.",
            "Hard work always pays off."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteText = findViewById(R.id.quoteText);
        generateBtn = findViewById(R.id.generateBtn);

        generateBtn.setOnClickListener(v -> {
            Random random = new Random();
            int index = random.nextInt(quotes.length);
            quoteText.setText(quotes[index]);
        });
    }
}
