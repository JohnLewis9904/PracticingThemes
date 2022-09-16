package com.example.practicingthemes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void clickMe(View v) {
        Intent intent = new Intent(OtherActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
