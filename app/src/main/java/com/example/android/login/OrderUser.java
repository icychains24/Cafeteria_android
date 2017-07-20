package com.example.android.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class OrderUser extends AppCompatActivity {

    String date;
    String foodItem;
    int yesCountUser = 0;
    int noCountUser = 0;
    int pendingCountUser = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_user);

        //com.example.android.login.AdminUpdateMenu user1 = new com.example.android.login.AdminUpdateMenu();


        Button yesOrdered = (Button) findViewById(R.id.yesButtonOrderUser);
        yesOrdered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //increment the yes count
                yesCountUser++;
               //user1.yesCount.setText(yesCountUser);

            }
        });

        Button noOrdered = (Button) findViewById(R.id.noButtonOrderUser);
        noOrdered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //increment the no count
                noCountUser++;
               //user1.noCount.setText(noCountUser);
            }
        });

    }
}
