package com.example.codingchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private String buttonMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        buttonMessage = getString(R.string.button_1_message);
        intent.putExtra(EXTRA_MESSAGE, buttonMessage);
        startActivity(intent);
    }


    public void button2(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        buttonMessage = getString(R.string.button_2_message);
        intent.putExtra(EXTRA_MESSAGE, buttonMessage);
        startActivity(intent);
    }

    public void button3(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        buttonMessage = getString(R.string.button_3_message);
        intent.putExtra(EXTRA_MESSAGE, buttonMessage);
        startActivity(intent);
    }
}