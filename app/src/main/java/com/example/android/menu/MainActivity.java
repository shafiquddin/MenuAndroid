package com.example.android.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Menu item, itemn, itemm;
    Button submit1, show1;
    TextView name1, password1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item = (Menu) findViewById(R.id.item1);
        itemn = (Menu) findViewById(R.id.item2);
        itemm = (Menu) findViewById(R.id.item3);
        submit1 = (Button) findViewById(R.id.submit);
        show1 = (Button) findViewById(R.id.show);
        name1 = (TextView) findViewById(R.id.name);
        password1 = (TextView) findViewById(R.id.password);
        show1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Show.class);
                intent.putExtra("name", name1.getText().toString());
                intent.putExtra("password", password1.getText().toString());
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "searching", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "Select schedule", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(this, "make a apointment", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(this, "cancelled", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void click(View view) {
        if (TextUtils.isEmpty(name1.getText().toString().trim()) || TextUtils.isEmpty(password1.getText().toString().trim())) {
            Toast.makeText(this, "please enter data", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "submitted", Toast.LENGTH_SHORT).show();
        }
    }
}



