package com.example.sambas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name;
    TextView myName;
    TextView myDisplay;
    TextView myHello;
Button myButton;
Button myClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.textView3);
        myName = (TextView) findViewById(R.id.textView4);
        myDisplay = (TextView) findViewById(R.id.textView5);
        myHello = (TextView) findViewById(R.id.textView6);
        myButton = (Button) findViewById(R.id.button);
        myClear = (Button) findViewById(R.id.button2);

        myButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
              myHello.setText("Hello Gian!");
            }
        });

        myClear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
              myHello.setText("Hello!");
            }
        });

    }
}