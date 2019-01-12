package com.example.don.checkboxes_and_etc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String toastMessage;// = "Toppings: ";
    private CheckBox chocolate;
    private CheckBox sprinkles;
    private CheckBox nuts;
    private CheckBox cherries;
    private CheckBox oreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chocolate = findViewById(R.id.chocolate_syrup_checkbox);
        sprinkles = findViewById(R.id.sprinkles_checkbox);
        nuts = findViewById(R.id.nuts_checkbox);
        cherries = findViewById(R.id.cherries_checkbox);
        oreo = findViewById(R.id.oreo_checkbox);
    }


    public void showToast(View view) {
        toastMessage = "Toppings: ";
        if (chocolate.isChecked()) {
            toastMessage += chocolate.getText();
            toastMessage += ", ";
        }
        if (sprinkles.isChecked()) {
            toastMessage += sprinkles.getText();
            toastMessage += ", ";
        }
        if (nuts.isChecked()) {
            toastMessage += nuts.getText();
            toastMessage += ", ";
        }
        if (cherries.isChecked()) {
            toastMessage += cherries.getText();
            toastMessage += ", ";
        }
        if (oreo.isChecked()) {
            toastMessage += oreo.getText();
            toastMessage += ", ";
        }

        if (toastMessage.length() >= 12) {
            toastMessage = toastMessage.substring(0, toastMessage.length() - 2);
        } else {
            toastMessage = "No toppings selected.";
        }
        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}
