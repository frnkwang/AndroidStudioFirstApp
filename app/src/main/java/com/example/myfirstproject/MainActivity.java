package com.example.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);
        String message = nameEditText.getText().toString();

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("extra_message", message);
        startActivity(intent);
    }
}