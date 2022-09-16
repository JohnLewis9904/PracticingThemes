package com.example.practicingthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    TextView myYellowText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.username = findViewById(R.id.editTextTextPersonName);
        this.password = findViewById(R.id.editTextTextPassword);
        this.myYellowText = findViewById(R.id.textView);
    }

    public void clickMe(View v) {
        Intent intent = new Intent(MainActivity.this, OtherActivity.class);
        if(parseExist(v)){
            startActivity(intent);
        }else{
            myYellowText.setText("Please enter a username and password.");
        }
    }

    public boolean parseExist(View v){
        return (!username.getText().toString().equals("")) && (!password.getText().toString().equals(""));
    }
}