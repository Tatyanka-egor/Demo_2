package com.example.demo_2.entity.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.demo_2.R;
import com.example.demo_2.databinding.ActivitySignInScreenBinding;
import com.example.demo_2.entity.common.CheckData;

public class SignInScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);
    }

    ActivitySignInScreenBinding activitySignInScreenBinding;
    public void Vhod(View view) {

        if(!activitySignInScreenBinding.EmailView.getText().toString().equals("")&&!activitySignInScreenBinding.PassView.getText().toString().equals("")){

            if(CheckData.checkMail(activitySignInScreenBinding.EmailView.getText().toString())){
                CheckData.autoConfirmed(SignInScreen.this,
                        activitySignInScreenBinding.EmailView.getText().toString(),
                        activitySignInScreenBinding.PassView.getText().toString());
            }//если почта правильная
            else {
                CheckData.makeMessege("неправильный E-mail",this);
            }
        }
        else {
            CheckData.makeMessege("поля ввода не заполнены",this);
        }
        //Intent signIn=new Intent(SignInScreen.this, MainScreen.class);
       // startActivity(signIn);
       // finish();
        //рабочий код просто надо создать мейн скрин


    }

    public void Regist(View view) {
        Intent intent=new Intent(SignInScreen.this,SignUpScreen.class);
        startActivity(intent);
        finish();
    }
}