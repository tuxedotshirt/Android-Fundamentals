package com.example.don.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView counter;
    private Button button;
    private int mCount = 0;
    private EditText editText;
    private String text;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        //get key value pair
        if(savedInstanceState != null){
            mCount = savedInstanceState.getInt("COUNTER_VALUE");
            counter.setText(Integer.toString(mCount));
            //text = savedInstanceState.getString("EDITTEXT_STRING");
            //editText.setText(text);
            Log.d(LOG_TAG, "-------");
            Log.d(LOG_TAG, "onCreate");
        }
    }

    public void incrementCounter(View view) {
        mCount++;
        counter = findViewById(R.id.textView);

        counter.setText(Integer.toString(mCount));
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNTER_VALUE", mCount);
        Log.d(LOG_TAG, "onSaveInstanceState");
        //outState.putString("EDITTEXT_STRING", String.valueOf(editText.getText()));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
}
