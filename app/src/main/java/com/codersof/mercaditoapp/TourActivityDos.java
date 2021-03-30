package com.codersof.mercaditoapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TourActivityDos extends AppCompatActivity {

    ImageButton imgButtonDos;
    ImageButton imgButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_activity_dos);

        imgButtonDos = (ImageButton)findViewById(R.id.imgActivityDos);
        imgButtonNext = (ImageButton)findViewById(R.id.imgButtonNext);

        imgButtonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(TourActivityDos.this, TourActivityDos.class);
                //startActivity(intent);

            }
        });
        imgButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(TourActivityUno.this, TourActivityDos.class);
               // startActivity(intent);
            }
        });
    }
}