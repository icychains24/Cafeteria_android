package com.example.android.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by USER on 6/28/2017.
 */

public class AdminLogin extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adminlogin);


         Button update_admin = (Button) findViewById(R.id.loginButton);
        update_admin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent orderUp = new Intent(AdminLogin.this, admin_update_menu.class);
                startActivity(orderUp);


            }
        });
    }
}



