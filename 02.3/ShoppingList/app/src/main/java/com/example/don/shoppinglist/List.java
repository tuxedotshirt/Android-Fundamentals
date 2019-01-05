package com.example.don.shoppinglist;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class List extends AppCompatActivity {
    TextView item;
    TextView item2;
    TextView item3;
    TextView item4;
    TextView item5;
    TextView item6;
    TextView item7;
    TextView item8;
    TextView item9;
    TextView item10;
    Button add_to_list;
    private EditText storeName;
    private Button findStoreButton;

    public static final int REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        item = findViewById(R.id.textView);
        item2 = findViewById(R.id.textView2);
        item3 = findViewById(R.id.textView3);
        item4 = findViewById(R.id.textView4);
        item5 = findViewById(R.id.textView5);
        item6 = findViewById(R.id.textView6);
        item7 = findViewById(R.id.textView7);
        item8 = findViewById(R.id.textView8);
        item9 = findViewById(R.id.textView9);
        item10 = findViewById(R.id.textView10);
        add_to_list = findViewById(R.id.button11);
        storeName = findViewById(R.id.editText);
        findStoreButton = findViewById(R.id.button12);
        if(savedInstanceState != null){

            if(savedInstanceState.getBoolean("one")) {
                item.setVisibility(View.VISIBLE);
                item.setText(savedInstanceState.getString("item"));
            }

            if(savedInstanceState.getBoolean("two")) {
                item2.setVisibility(View.VISIBLE);
                item2.setText(savedInstanceState.getString("item2"));
            }

            if(savedInstanceState.getBoolean("three")) {
                item3.setVisibility(View.VISIBLE);
                item3.setText(savedInstanceState.getString("item3"));
            }

            if(savedInstanceState.getBoolean("four")) {
                item4.setVisibility(View.VISIBLE);
                item4.setText(savedInstanceState.getString("item4"));
            }

            if(savedInstanceState.getBoolean("five")) {
                item5.setVisibility(View.VISIBLE);
                item5.setText(savedInstanceState.getString("item5"));
            }

            if(savedInstanceState.getBoolean("six")) {
                item6.setVisibility(View.VISIBLE);
                item6.setText(savedInstanceState.getString("item6"));
            }

            if(savedInstanceState.getBoolean("seven")) {
                item7.setVisibility(View.VISIBLE);
                item7.setText(savedInstanceState.getString("item7"));
            }

            if(savedInstanceState.getBoolean("eight")) {
                item8.setVisibility(View.VISIBLE);
                item8.setText(savedInstanceState.getString("item8"));
            }

            if(savedInstanceState.getBoolean("nine")) {
                item9.setVisibility(View.VISIBLE);
                item9.setText(savedInstanceState.getString("item9"));
            }

            if(savedInstanceState.getBoolean("ten")) {
                item10.setVisibility(View.VISIBLE);
                item10.setText(savedInstanceState.getString("item10"));
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        String itemName = null;
        if (requestCode == REQUEST) {
            if (resultCode == RESULT_OK) {
                itemName = data.getStringExtra(Food.EXTRA_REPLY);
            }

            if(item.getVisibility() == View.INVISIBLE){
                 item.setVisibility(View.VISIBLE);
                 item.setText(itemName);
            }
            else if(item2.getVisibility() == View.INVISIBLE){
                item2.setVisibility(View.VISIBLE);
                item2.setText(itemName);
            }
            else if(item3.getVisibility() == View.INVISIBLE){
                item3.setVisibility(View.VISIBLE);
                item3.setText(itemName);
            }
            else if(item4.getVisibility() == View.INVISIBLE){
                item4.setVisibility(View.VISIBLE);
                item4.setText(itemName);
            }
            else if(item5.getVisibility() == View.INVISIBLE){
                item5.setVisibility(View.VISIBLE);
                item5.setText(itemName);
            }
            else if(item6.getVisibility() == View.INVISIBLE){
                item6.setVisibility(View.VISIBLE);
                item6.setText(itemName);
            }
            else if(item7.getVisibility() == View.INVISIBLE){
                item7.setVisibility(View.VISIBLE);
                item7.setText(itemName);
            }
            else if(item8.getVisibility() == View.INVISIBLE){
                item8.setVisibility(View.VISIBLE);
                item8.setText(itemName);
            }
            else if(item9.getVisibility() == View.INVISIBLE){
                item9.setVisibility(View.VISIBLE);
                item9.setText(itemName);
            }
            else if(item10.getVisibility() == View.INVISIBLE){
                item10.setVisibility(View.VISIBLE);
                item10.setText(itemName);
            }
            else{
                //toast message that says list is full
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        if(item.getVisibility() == View.VISIBLE){
            outState.putBoolean("one",true);
            outState.putString("item",item.getText().toString());
        }
        if(item2.getVisibility() == View.VISIBLE){
            outState.putBoolean("two",true);
            outState.putString("item2",item2.getText().toString());
        }
        if(item3.getVisibility() == View.VISIBLE){
            outState.putBoolean("three",true);
            outState.putString("item3",item3.getText().toString());
        }
        if(item4.getVisibility() == View.VISIBLE){
            outState.putBoolean("four",true);
            outState.putString("item4",item4.getText().toString());
        }
        if(item5.getVisibility() == View.VISIBLE){
            outState.putBoolean("five",true);
            outState.putString("item5",item5.getText().toString());
        }
        if(item6.getVisibility() == View.VISIBLE){
            outState.putBoolean("six",true);
            outState.putString("item6",item6.getText().toString());
        }
        if(item7.getVisibility() == View.VISIBLE){
            outState.putBoolean("seven",true);
            outState.putString("item7",item7.getText().toString());
        }
        if(item8.getVisibility() == View.VISIBLE){
            outState.putBoolean("eight",true);
            outState.putString("item8",item8.getText().toString());
        }
        if(item9.getVisibility() == View.VISIBLE){
            outState.putBoolean("nine",true);
            outState.putString("item9",item9.getText().toString());
        }
        if(item10.getVisibility() == View.VISIBLE){
            outState.putBoolean("ten",true);
            outState.putString("item10",item10.getText().toString());
        }
    }

    public void go_to_food(View view) {
        Intent intent = new Intent(this, Food.class);
        startActivityForResult(intent,REQUEST);
    }

    public void findStore(View view) {
        String loc = storeName.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
