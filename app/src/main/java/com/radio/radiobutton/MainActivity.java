package com.radio.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaring global variables
    ConstraintLayout constraintLayout;
    RadioGroup radioGroup;
    RadioButton radioButtonRed, radioButtonGreen, radioButtonBlue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initializing varables

        constraintLayout = findViewById(R.id.radiobg_will_change);
        radioGroup = findViewById(R.id.radiogroup);
        radioButtonRed = findViewById(R.id.red_bg);
        radioButtonGreen = findViewById(R.id.green_bg);
        radioButtonBlue = findViewById(R.id.blue_bg);


        //set action to radio group

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                switch (i) {
                    case R.id.red_bg:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FEACBC"));
                        Toast.makeText(MainActivity.this, "Your Background is now set to Red", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.green_bg:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF6EFEAA"));
                        Toast.makeText(MainActivity.this, "Your Background is now set to Green", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.blue_bg:
                        constraintLayout.setBackgroundColor(Color.parseColor("#FF87CFFB"));
                        Toast.makeText(MainActivity.this, "Your Background is now set to Blue", Toast.LENGTH_SHORT).show();
                        break;
                }


            }
        });


    }
}