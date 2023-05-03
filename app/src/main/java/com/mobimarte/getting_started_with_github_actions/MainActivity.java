package com.mobimarte.getting_started_with_github_actions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(() ->{

            Toast.makeText(this, "Hello Benjie?", Toast.LENGTH_SHORT).show();
        }, 3000);
    }
}