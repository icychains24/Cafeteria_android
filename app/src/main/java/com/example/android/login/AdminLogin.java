package com.example.android.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

/**
 * Created by USER on 6/28/2017.
 */

public class AdminLogin extends AppCompatActivity {

    EditText phoneNumber;
    private DatabaseReference mDatabase;
    private DatabaseReference countDatabase;
    private Button mFirebaseUserBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);

        mFirebaseUserBtn = (Button) findViewById(R.id.userConfirmButtonActivityMain);

        mDatabase = FirebaseDatabase.getInstance().getReference();



        //When admin clicks the login button
        Button loginAsAdmin = (Button) findViewById(R.id.loginButtonAdminLogin);
        loginAsAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //When admin enters phone numbers
                phoneNumber = (EditText) findViewById(R.id.phoneNumberEnterTextAdminLogin);
                String adminMobile = phoneNumber.getText().toString();

                HashMap<String, String> dataMap = new HashMap<String, String>();
                dataMap.put("Mobile", adminMobile);
                dataMap.put("Name", "I am admin!");
                mDatabase.child("ADMIN").push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Log.v("MainActivity", "if task is successful");
                            Toast.makeText(AdminLogin.this,"Data Stored Successfully", Toast.LENGTH_LONG).show();

                        }
                        else{
                            Log.v("MainActivity", "if task is NOT successful");
                            Toast.makeText(AdminLogin.this,"Data Not Stored", Toast.LENGTH_LONG).show();

                        }
                    }
                });


            }

        });

    } //method OnCreate()
} //class AdminLogin



