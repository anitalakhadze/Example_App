package com.example.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void clickFunction (View view) {
        EditText nameEditText = (EditText) findViewById(R.id.editTextTextPersonName);
        String name = nameEditText.getText().toString();
        TextView title = findViewById(R.id.textView);
        title.setText("Hello " + name + "!");
        Log.i("Info", "Button pressed by " + name + "!");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}