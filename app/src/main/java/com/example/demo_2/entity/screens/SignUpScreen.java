package com.example.demo_2.entity.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demo_2.R;
import com.example.demo_2.databinding.ActivitySignUpScreenBinding;

public class SignUpScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }
    ActivitySignUpScreenBinding activitySignUpScreenBinding;

    public void Vozvrat(View view) {

        Intent intent=new Intent(SignUpScreen.this,SignInScreen.class);
        startActivity(intent);
    }
}