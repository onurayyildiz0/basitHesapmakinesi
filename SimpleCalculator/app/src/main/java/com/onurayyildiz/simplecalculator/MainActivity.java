package com.onurayyildiz.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText number;
    EditText number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number = findViewById(R.id.number);
         number2 = findViewById(R.id.number2);
         resultText = findViewById(R.id.result);

    }


    public void sum(View view){


        int number0 = Integer.parseInt(number.getText().toString());
        int number1 = Integer.parseInt(number2.getText().toString());

        int Result = number1 + number0;
        resultText.setText("Result: " + Result);


    }

    public void deduct(View view){

        int number0 = Integer.parseInt(number.getText().toString());
        int number1 = Integer.parseInt(number2.getText().toString());

        int Result = number0 - number1;
        resultText.setText("Result: " + Result);


    }

    public void multiply(View view){

        int number0 = Integer.parseInt(number.getText().toString());
        int number1 = Integer.parseInt(number2.getText().toString());

        int Result = number1 * number0;
        resultText.setText("Result: " + Result);


    }
    public void divide(View view){

        int number0 = Integer.parseInt(number.getText().toString());
        int number1 = Integer.parseInt(number2.getText().toString());

        int Result = number0 / number1;
        resultText.setText("Result: " + Result);


    }
}