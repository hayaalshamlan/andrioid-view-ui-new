package com.joincoded.androidviewui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> question = new ArrayList<>();
    ArrayList<Boolean> answer = new ArrayList<>();
    private  int currentIndex = 0;
    int score = 0;

    TextView questionTextView, answertTextView, correctTextView;
    Button falseButton, trueButton, nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question.add("Is haya 24 years old?");
        answer.add(false);
        question.add("Haya is a doctor?");
        answer.add(false);
        question.add("Is haya 26 years old?");
        answer.add(true);
        question.add("Haya is a mother?");
        answer.add(false);
        question.add("Haya graduated from AUM?");
        answer.add(true);

        questionTextView = findViewById(R.id.questionTextView);
        answertTextView = findViewById(R.id.answertTextView);
        falseButton = findViewById(R.id.falseButton);
        trueButton = findViewById(R.id.trueButton);
        nextButton = findViewById(R.id.nextButton);
        correctTextView = findViewById(R.id.correctTextView);


        falseButton.setOnClickListener(v -> {

        });

        trueButton.setOnClickListener(v -> {


        });
        nextButton.setOnClickListener(v -> {


        });

      question = new ArrayList<>();
      answer = new ArrayList<>();

        question.add("Is haya 24 years old?");
        answer.add(false);
        question.add("Haya is a doctor?");
        answer.add(false);
        question.add("Is haya 26 years old?");
        answer.add(true);
        question.add("Haya is a mother?");
        answer.add(false);
        question.add("Haya graduated from AUM?");
        answer.add(true);

        dislayQuestion();
    }

    public void dislayQuestion(){
        questionTextView.setText(questions.get(currentIndex));
        correctTextView.setVisibility(View.INVISIBLE);
        trueButton.setVisibility(View.VISIBLE);
        falseButton.setVisibility(View.VISIBLE);
            }
            private  void checkAnswer(boolean userAnswer){
        boolean correctAnswer = answer.get(currentIndex);
        if(userAnswer == correctAnswer){
            trueButton.setVisibility(View.INVISIBLE);
            falseButton.setVisibility(View.INVISIBLE);

        }
            }
    public void show(View view){
        view.setVisibility(View.VISIBLE);
    }

    public void hide(View view){
        view.setVisibility(View.INVISIBLE);
    }

}