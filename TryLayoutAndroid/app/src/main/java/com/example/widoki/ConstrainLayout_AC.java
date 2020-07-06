package com.example.widoki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ConstrainLayout_AC extends AppCompatActivity {


    protected Button toastButton;
    String toastString = "Wiadomosc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrain_layout__a_c);

        toastButton = (Button)findViewById(R.id.toast_button);

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), toastString,Toast.LENGTH_LONG).show();
            }
        });
    }
    public void moveToHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
