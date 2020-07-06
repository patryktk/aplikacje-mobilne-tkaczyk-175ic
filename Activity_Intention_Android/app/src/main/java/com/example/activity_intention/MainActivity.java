package com.example.activity_intention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToMessage(View view){
        Intent intent = new Intent(this, show_message.class);
        startActivity(intent);
    }

    public void goToSendMessage(View view){
        Intent intent = new Intent(this, send_message.class);
        startActivity(intent);
    }
}
