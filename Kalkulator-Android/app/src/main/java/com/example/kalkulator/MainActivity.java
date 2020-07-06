package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        Float result;
        String value1 = String.valueOf(spinner2.getSelectedItem());
        String value2 = String.valueOf(spinner3.getSelectedItem());

        switch (view.getId()){
            case R.id.button:
                result = Float.parseFloat(value1) + Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;
            case R.id.button2:
                result = Float.parseFloat(value1) - Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;
            case R.id.button3:
                result = Float.parseFloat(value1) * Float.parseFloat(value2);
                textView.setText(String.valueOf(result));
                break;
            case R.id.button4:
                if(Float.parseFloat(value2) > 0 ){
                    result = Float.parseFloat(value1) / Float.parseFloat(value2);
                    textView.setText(String.valueOf(result));
                }else{
                    textView.setText("Nie dziel przez 0");
                }
        }
    }

    @Override
    public void onClick(View v) {

    }
}
