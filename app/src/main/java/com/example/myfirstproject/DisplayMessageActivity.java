package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message = intent.getStringExtra("extra_message");

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView); // Get TextView
        message = "Hello, " + message; // Add "Hello, " to the message
        nameTextView.setText(message); // Set the text in the TextView
    }
}