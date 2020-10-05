package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.shoppinglist.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void addItem(View view) {
        Button b = (Button)view;
        Intent intent = new Intent();
        String message = b.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        setResult(1, intent);
        Log.i("MSG", message);
        finish();
    }
}