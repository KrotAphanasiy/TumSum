package com.tumsum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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