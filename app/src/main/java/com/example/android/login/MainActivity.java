package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

import static com.example.android.login.R.id.userMobileNumberInputActivityMain;
import static com.example.android.login.R.id.userNameInputActivityMain;

public class MainActivity extends AppCompatActivity {

    //String phoneNumber;
    //String name;
    private DatabaseReference mDatabase;
    private DatabaseReference countDatabase;
    private Button mFirebaseUserBtn;
    EditText userName;
    EditText userPhoneNumber;
    Button userConfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseUserBtn = (Button) findViewById(R.id.userConfirmButtonActivityMain);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        //When user clicks the Confirm button
        userConfirm = (Button) findViewById(R.id.userConfirmButtonActivityMain);
        userConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //When user enters name
                userName = (EditText) findViewById(userNameInputActivityMain);
                String  name = userName.getText().toString();

                //When user enters the phone number
                userPhoneNumber = (EditText) findViewById(userMobileNumberInputActivityMain);
                String phoneNumber = userPhoneNumber.getText().toString();

                //Part 1 - Saving to Database code here
                HashMap<String, String> dataMap = new HashMap<String, String>();
                dataMap.put("Mobile",phoneNumber);
                dataMap.put("Name",name);
                mDatabase.child("USERS").push().setValue(dataMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Log.v("MainActivity", "if task is successful");
                            Toast.makeText(MainActivity.this,"Data Stored Successfully", Toast.LENGTH_LONG).show();
                            userPhoneNumber.setText("");
                            userName.setText("");
                        }
                        else{
                            Log.v("MainActivity", "if task is NOT successful");
                            Toast.makeText(MainActivity.this,"Data Not Stored", Toast.LENGTH_LONG).show();
                            userPhoneNumber.setText("");
                            userName.setText("");
                        }
                    }
                });


                //Part 2 - OTP code here
                Intent intent = new Intent(MainActivity.this, OTP.class);
                startActivity(intent);

            }
        });

        //when admin clicks the 'if admin, click here' text at the bototm
        TextView ifAdmin = (TextView) findViewById(R.id.ifAdminClickHereTextActivityMain);
        ifAdmin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, AdminLogin.class);
                startActivity(intent);
            }
        });


    }//main()

} //class MainActivity
