package com.eomsbd.eighteastersprayer.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.eomsbd.eighteastersprayer.R;
import com.github.nikartm.support.StripedProcessButton;

public class StartActivity extends AppCompatActivity {
    private StripedProcessButton stripedButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        stripedButton = findViewById(R.id.btn_4);

        stripedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartActivity.this,MainActivity.class));
               initStripedButton();
            }
        });
    }
    private void initStripedButton() {
        stripedButton.setCornerRadius(50)
                .setStripeAlpha(0.7f)
                .setStripeRevert(true)
                .setStripeGradient(false);

    }
}
