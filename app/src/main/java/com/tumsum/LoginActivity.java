package com.tumsum;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }

    @Override
    protected void onStart(){
        super.onStart();

    }

    public void onLoginClick(View view){
        Intent intent = new Intent(this, MainPageActivity.class);
        startActivity(intent);
    }

    public void onRegisterClick(View view){

    }
}
