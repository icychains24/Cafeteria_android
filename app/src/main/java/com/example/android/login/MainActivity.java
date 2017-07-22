package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //When user enters the phone number
        EditText userPhoneNumber = (EditText) findViewById(R.id.userMobileNumberInputActivityMain);
        phoneNumber = userPhoneNumber.getText().toString();

        //When user clicks the Confirm button
        Button userConfirm = (Button) findViewById(R.id.userConfirmButtonActivityMain);
        userConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OTP.class);
                startActivity(intent);

            }
        });

        //when admin clicks the 'if admin, click here' text at the bototm
        TextView ifAdmin = (TextView) findViewById(R.id.ifAdminClickHereTextActivityMain);
        ifAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(intent2);
            }
        });


    } //main()

} //class MainActivity
