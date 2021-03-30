package com.codersof.mercaditoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TourActivityUno extends AppCompatActivity {

    ImageButton imgButtonUno;
    ImageButton imgButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_activity_uno);

        imgButtonUno = (ImageButton)findViewById(R.id.imgActivityUno);
        imgButtonNext = (ImageButton)findViewById(R.id.imgButtonNext);

        imgButtonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TourActivityUno.this, TourActivityDos.class);
                finish();
                startActivity(intent);

            }
        });
        imgButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TourActivityUno.this, TourActivityDos.class);
                finish();
                startActivity(intent);
            }
        });
    }
}