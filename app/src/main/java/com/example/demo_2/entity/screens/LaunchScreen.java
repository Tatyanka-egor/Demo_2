package com.example.demo_2.entity.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.demo_2.R;

public class LaunchScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);
        Intent intent = new Intent(this, SignInScreen.class);
        startActivity(intent);
        finish();
    }
    //Runnable r = new Runnable() {
        //@Override
        //public void run(){
        //    Intent intent = new Intent(this,SignInScreen.class);
        //    startActivity(intent);
       // }
   // };
   // Handler h = new Handler();
   // h.postDelayed(r, 3000);
}