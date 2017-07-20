package com.example.android.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class AdminUpdateMenu extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin_update);

        TextView yesCount = (TextView) findViewById(R.id.yesCountTextAdminUpdate);
        TextView noCount = (TextView) findViewById(R.id.noCountTextAdminUpdate);
        TextView pendingCount = (TextView) findViewById(R.id.pendingCountTextAdminUpdate);

        //Spinner to select food options
        spinner = (Spinner) findViewById(R.id.foodSpinnerMenuAdminUpdate);
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
        });

        //when admin clicks the 'update item' button
        Button updateItem = (Button) findViewById(R.id.updateItemButtonAdminUpdate);
        updateItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //updates the food item for the day
            }
        });

        //when admin clicks the 'manage users' button
        Button manageUsers = (Button) findViewById(R.id.manageUsersButtonAdminUpdate);
        manageUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent goToManageUsers = new Intent(AdminUpdateMenu.this, goToManageUsers.class);
                //startActivity(goToManageUsers);
            }
        });

    }
}
