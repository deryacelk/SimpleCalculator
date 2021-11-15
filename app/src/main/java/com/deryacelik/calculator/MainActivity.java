package com.deryacelik.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    //tanımlama
    EditText number1;
    EditText number2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //baslatma
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        resultText = (TextView) findViewById(R.id.textView);

    }

    public void sum (View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Değer Giriniz");
        } else {
            int a = Integer.parseInt(number1.getText().toString());
            int b = Integer.parseInt(number2.getText().toString());
            int resultInteger = a + b;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void deduct (View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Değer Giriniz");
        } else {
            int a = Integer.parseInt(number1.getText().toString());
            int b = Integer.parseInt(number2.getText().toString());
            int resultInteger = a - b;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void divide (View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Değer Giriniz");
        } else {
            int a = Integer.parseInt(number1.getText().toString());
            int b = Integer.parseInt(number2.getText().toString());
            int resultInteger = a / b;

            resultText.setText("Result: " + resultInteger);
        }
    }
    public void multiply (View view){
        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")) {
            resultText.setText("Değer Giriniz");
        } else {
            int a = Integer.parseInt(number1.getText().toString());
            int b = Integer.parseInt(number2.getText().toString());
            int resultInteger = a * b;

            resultText.setText("Result: " + resultInteger);
        }
    }

    public void buttonClicked(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }

}