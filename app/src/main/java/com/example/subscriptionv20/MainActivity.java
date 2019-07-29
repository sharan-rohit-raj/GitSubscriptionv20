package com.example.subscriptionv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton AddCust = (ImageButton)findViewById(R.id.addcust);

        AddCust.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GotoAddCustomer();
            }
        });
    }

    //Sends to next Activity
    public void GotoAddCustomer(){
        Intent intent = new Intent(this, AddCustomer.class);
        startActivity(intent);
    }
}