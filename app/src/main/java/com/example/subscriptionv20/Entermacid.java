package com.example.subscriptionv20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Entermacid extends AppCompatActivity {

    EditText macidentered;
    ImageButton snd;

    String custmacid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entermacid);
        macidentered = (EditText)findViewById(R.id.macidenter);
        snd = (ImageButton)findViewById(R.id.send);

        snd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToDisplayCustomer();
            }
        });
    }

    public void GoToDisplayCustomer(){

        custmacid = macidentered.getText().toString();
        Intent intent = new Intent(this, DisplayUsers.class);
        intent.putExtra("MAC ID",custmacid);
        startActivity(intent);
    }
}
