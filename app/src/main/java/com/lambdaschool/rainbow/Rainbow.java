package com.lambdaschool.rainbow;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rainbow extends AppCompatActivity {

    Button                          buttonBlackBackground;
    Button                          buttonBlueBackground;
    Button                          buttonRedBackground;
    Button                          buttonPurpleBackground;
    Button                          buttonYellowBackground;
    Button                          buttonGreenBackground;
    ConstraintLayout        layoutBackground;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainbow);

        layoutBackground                        =findViewById(R.id.layout_background);
            buttonBlackBackground          =findViewById(R.id.black_background);
            buttonBlackBackground.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutBackground.setBackgroundColor(getResources().getColor(android.R.color.black));
                }
            });
            buttonBlueBackground               =findViewById(R.id.blue_background);
            buttonBlueBackground.setOnClickListener(new View.OnClickListener(){
                @Override
                public void  onClick(View view){
                    layoutBackground.setBackgroundColor(getResources().getColor(R.color.blue));
                }
            });
            buttonRedBackground                 =findViewById(R.id.red_background);
            buttonRedBackground.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutBackground.setBackgroundColor(getResources().getColor(R.color.red));
                }
            });
            buttonPurpleBackground              =findViewById(R.id.purple_background);
            buttonPurpleBackground.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutBackground.setBackgroundColor(getResources().getColor(R.color.purple));
                }
            });
            buttonYellowBackground            =findViewById(R.id.yellow_background);
            buttonYellowBackground.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutBackground.setBackgroundColor(getResources().getColor(R.color.yellow));
                }
            });
            buttonGreenBackground                  =findViewById(R.id.green_background);
            buttonGreenBackground .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    layoutBackground.setBackgroundColor((getResources().getColor(R.color.green)));
                }
            });
    }
}
