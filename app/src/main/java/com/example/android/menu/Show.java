package com.example.android.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Show extends AppCompatActivity {
    TextView namep1, passwordp1;
    String string1, string2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        namep1 = (TextView) findViewById(R.id.namep);
        passwordp1 = (TextView) findViewById(R.id.passwordp);
        Intent intent = getIntent();
        string1 = intent.getStringExtra("name");
        string2 = intent.getStringExtra("password");
        namep1.setText(string1);
        passwordp1.setText(string2);

    }

}
