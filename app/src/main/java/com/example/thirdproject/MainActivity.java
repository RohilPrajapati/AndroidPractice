package com.example.thirdproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clicked;
        clicked = findViewById(R.id.redirect);
        clicked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                Intent intent1 = new Intent(MainActivity.this,Home.class);
                startActivity(intent1);
                Toast.makeText(MainActivity.this, "You have been redirect", Toast.LENGTH_SHORT).show();
            }
        });
    }
}