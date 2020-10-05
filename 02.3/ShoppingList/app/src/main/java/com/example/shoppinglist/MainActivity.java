package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText storeNameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storeNameText = findViewById(R.id.store_edittext);
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

    public void openMap(View view) {
        String loc = storeNameText.getText().toString();
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
