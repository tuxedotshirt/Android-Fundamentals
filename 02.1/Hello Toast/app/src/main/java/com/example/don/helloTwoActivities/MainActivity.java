package com.example.don.helloTwoActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE = "com.example.don.helloTwoActivities.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = String.valueOf(mCount);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
