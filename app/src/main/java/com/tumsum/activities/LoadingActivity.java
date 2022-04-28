package com.tumsum.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.tumsum.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

}