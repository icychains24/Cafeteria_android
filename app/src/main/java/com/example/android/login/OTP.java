package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OTP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        //When user enters the OTP and clicks the 'Sign Up' button
        Button userSignUp = (Button) findViewById(R.id.userSignUpButtonActivityOTP);
        userSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OTP.this, OrderUser.class);
                startActivity(intent);
                Toast.makeText(view.getContext(), "Your account has been created!", Toast.LENGTH_LONG).show();
            }
        });
    }
}

