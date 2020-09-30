package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openList(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivityForResult(intent, 1);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String message = data.getStringExtra(MainActivity2.EXTRA_MESSAGE);
        TextView list = findViewById(R.id.textView);
        if(message == null)
            Log.i("NULL MSG", "null");
        if(message != null) {
            Log.i("Reply MSG", message);
            list.append(message);
            list.append("\n");
        }
        }
    }
