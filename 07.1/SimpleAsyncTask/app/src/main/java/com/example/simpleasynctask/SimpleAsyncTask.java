package com.example.simpleasynctask;

import android.os.AsyncTask;
import android.os.Build;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import org.w3c.dom.Text;

import java.lang.ref.WeakReference;
import java.util.Random;

public class SimpleAsyncTask extends AsyncTask<Void, Integer, String> {

        private WeakReference<TextView> mTextView;
        private WeakReference<TextView> mProgressTextView;
        private int s;
        private WeakReference<ProgressBar> mProgressBar;

        SimpleAsyncTask(TextView tv, TextView ptv, ProgressBar pb) {
            mTextView = new WeakReference<>(tv);
            mProgressTextView = new WeakReference<>(ptv);
            mProgressBar = new WeakReference<>(pb);
        }

        @Override
        protected String doInBackground(Void... voids) {

            Random r = new Random();
            int n = r.nextInt(11);

            s = n * 200;
            mProgressBar.get().setMax(s);
            //mProgressBar.get().setProgress((int) s/2);

            try {
                //Thread.sleep(s);
                for(int i = 0; i <= s; i++) {
                    Thread.sleep(1);
                    publishProgress(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Done at last after waiting " + s + " milliseconds!";
        }



    protected void onPostExecute(String result) {
            mTextView.get().setText(result);
        }

        protected void onProgressUpdate(Integer... progress){
            mProgressTextView.get().setText("Waited for " + progress[0] + "ms");
            //mProgressBar.get().setProgress(progress[0]);
            mProgressBar.get().setProgress(progress[0]);
        }

}
