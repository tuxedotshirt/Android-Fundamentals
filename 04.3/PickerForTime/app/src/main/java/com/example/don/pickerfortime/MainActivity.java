package com.example.don.pickerfortime;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment newFragment = new BlankFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.timePicker));
    }

    public void processTimePickerResult(int hour, int minute){
        String hour_string = Integer.toString(hour);
        String minute_string = Integer.toString(minute);
        String timeMessage = ("The time is:" + hour_string + ":" + minute_string);
        String AM_PM = "AM";
        String mm_precede = "";
        if (hour >= 12) {
            AM_PM = "PM";
            if(hour >= 13 && hour < 24){
                hour -= 12;
            }
            else
                hour = 12;
        }
        else if(hour == 0){
            hour = 12;
        }
        if(minute < 10){
            mm_precede = "0";
        }
        Toast.makeText(MainActivity.this, hour + ":" + mm_precede + minute + AM_PM, Toast.LENGTH_LONG).show();
    }
}
