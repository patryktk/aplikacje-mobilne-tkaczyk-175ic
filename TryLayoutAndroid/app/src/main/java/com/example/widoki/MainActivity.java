package com.example.widoki;

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
    public void moveToConstraint(View view){
        Intent intent = new Intent(this, ConstrainLayout_AC.class);
        startActivity(intent);
    }
    public void moveToFrame(View view){
        Intent intent = new Intent(this, FramLayout_AC.class);
        startActivity(intent);
    }
}
