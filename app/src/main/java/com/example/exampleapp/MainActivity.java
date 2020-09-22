package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void login (View view) {
        EditText nameEditText = (EditText) findViewById(R.id.name);
        String name = nameEditText.getText().toString();
        EditText passwordEditText = (EditText) findViewById(R.id.password);
        String password = passwordEditText.getText().toString();
        TextView hello = (TextView) findViewById(R.id.hello);
        hello.setText("Hello " + name + "!");
        Log.i("Info", "User's name is " + name + " and password is '" + password + "'");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}