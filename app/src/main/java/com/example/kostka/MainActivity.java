package com.example.kostka;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button fButton = findViewById(R.id.Button1);
        ImageView iview = findViewById(R.id.image1);

        fButton.setOnClickListener(v->{
            Drawable[] roll= new Drawable[6];
            roll[0]=getResources().getDrawable(R.drawable.dice_1);
            roll[1]=getResources().getDrawable(R.drawable.dice_2);
            roll[2]=getResources().getDrawable(R.drawable.dice_3);
            roll[3]=getResources().getDrawable(R.drawable.dice_4);
            roll[4]=getResources().getDrawable(R.drawable.dice_5);
            roll[5]=getResources().getDrawable(R.drawable.dice_6);
            int a;
            Random rand = new Random();

            a= rand.nextInt(6);

            iview.setImageDrawable(roll[a]);
        });


    }
}