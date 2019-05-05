package com.eomsbd.eighteastersprayer.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.eomsbd.eighteastersprayer.R;

public class SplashScreen extends AppCompatActivity {
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        new Thread() {
            public void run() {
                try {
                    sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {

                    Intent intent = new Intent( SplashScreen.this, StartActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }.start();
    }
}
