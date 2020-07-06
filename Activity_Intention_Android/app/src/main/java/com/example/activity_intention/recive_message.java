package com.example.activity_intention;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class recive_message extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="message" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);
    }

    public void homePage(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
