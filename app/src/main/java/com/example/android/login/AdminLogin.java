package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by USER on 6/28/2017.
 */

public class AdminLogin extends AppCompatActivity {

    String adminMobile;
    String adminPin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);



        EditText phoneNumber = (EditText) findViewById(R.id.phoneNumberEnterTextAdminLogin);
        adminMobile = phoneNumber.getText().toString();

        EditText pin = (EditText) findViewById(R.id.pinAdminLogin);
        adminPin = pin.getText().toString();


        //When admin clicks the login button
        Button loginAsAdmin = (Button) findViewById(R.id.loginButtonAdminLogin);
        loginAsAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //if(adminPin == "0000") {
                Intent intent = new Intent(AdminLogin.this, AdminUpdateMenu.class);
                startActivity(intent);
                //}
                //else
                    //Toast.makeText(view.getContext(), "Wrong PIN entered!", Toast.LENGTH_SHORT).show();*/

            }

        });

    } //method OnCreate()
} //class AdminLogin



