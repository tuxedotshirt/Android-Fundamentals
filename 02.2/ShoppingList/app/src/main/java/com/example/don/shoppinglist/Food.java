package com.example.don.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food extends AppCompatActivity {
public static final String EXTRA_REPLY = "com.example.don.shoppinglist.extra.REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
    }

    public void addToList(View view) {
    Button b = (Button) view;
    String item = b.getText().toString();
    //send item back to list
        Intent intent = new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK,intent);
        finish();
    }

}
