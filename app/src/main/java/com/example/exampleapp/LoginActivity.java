package com.example.exampleapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edName;
    EditText edPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Login Clicked", Toast.LENGTH_SHORT).show();
                if(edName.getText().toString().equals("Admin") && edPass.getText().toString().equals("pass")){
                    startMain();
                }
            }
        });

    }

    private void startMain() {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        String name = edName.getText().toString();
        String password = edPass.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("Name", name);
        bundle.putString("Password", password);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    private void initViews() {
        btnLogin = findViewById(R.id.button2);
        edName = findViewById(R.id.name);
        String name = edName.getText().toString();
        edPass = findViewById(R.id.password);
        String password = edPass.getText().toString();
        ImageView catBefore = findViewById(R.id.cat1);
        catBefore.setImageResource(R.drawable.cat2);
        TextView hello =  findViewById(R.id.hello);
        hello.setText("Hello " + name + "!");
//        Toast.makeText(this, "Hello " + name + "!", Toast.LENGTH_SHORT).show();
        Log.i("Info", "User's name is " + name + " and password is '" + password + "'");
    }
}
