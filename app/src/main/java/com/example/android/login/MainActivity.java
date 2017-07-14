package com.example.android.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Button login_user=(Button) findViewById(R.id.loginu);
//        login_user.setOnClickListener(new View.OnClickListener(){
//       @Override
//            public void onClick(View view)
//            {
//                Intent userloginintent=new Intent(MainActivity.this,UserLogin.class);
//                startActivity(userloginintent);
//
//
//            }
//        });
//
//
//        Button login_admin=(Button) findViewById(R.id.logina);
//        login_admin.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view)
//            {
//                Intent adminloginintent=new Intent(MainActivity.this,AdminLogin.class);
//                startActivity(adminloginintent);
//
//
//            }
//        });
//
//
//        Button signUpAdmin =(Button) findViewById(R.id.sign_up_admin);
//        signUpAdmin.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view)
//            {
//                Intent signUpAdminIntent =new Intent(MainActivity.this,signUpAsAdmin.class);
//                startActivity(signUpAdminIntent);
//
//
//            }
//        });
//
//        Button signUpUser =(Button) findViewById(R.id.sign_up_user);
//        signUpUser.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view)
//            {
//                Intent signUpUserIntent=new Intent(MainActivity.this,signUpAsUser.class);
//                startActivity(signUpUserIntent);
//
//
//            }
//        });

    }

    public void userSignIn(View view) {
        //nothing yet
    }


}
