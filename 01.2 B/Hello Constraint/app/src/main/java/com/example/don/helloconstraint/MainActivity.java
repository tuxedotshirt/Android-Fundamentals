package com.example.don.helloconstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zeroButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount % 2 == 0) {
            view.setBackgroundColor(getResources().getColor(R.color.countBackground));
        }
        else
            view.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
    }

    public void zero(View view){
        mCount = 0;
        zeroButton.setBackgroundColor(getResources().getColor(R.color.colorAccent));

        mShowCount.setText(Integer.toString(mCount));
    }
}
