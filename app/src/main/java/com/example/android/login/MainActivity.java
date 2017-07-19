package com.example.android.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*spinner = (Spinner) findViewById(R.id.spinnerMenu);
        adapter = ArrayAdapter.createFromResource(this, R.array.food_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(getBaseContext(),parent.getItemAtPosition(position) + " is selected", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*/


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
