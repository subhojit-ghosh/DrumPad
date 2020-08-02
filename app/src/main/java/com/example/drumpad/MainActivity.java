package com.example.drumpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.imageButton1);
        b2 = findViewById(R.id.imageButton2);
        b3 = findViewById(R.id.imageButton3);
        b4 = findViewById(R.id.imageButton4);
        b5 = findViewById(R.id.imageButton5);
        b6 = findViewById(R.id.imageButton6);
        b7 = findViewById(R.id.imageButton7);
        b8 = findViewById(R.id.imageButton8);

        m1 = MediaPlayer.create(this, R.raw.one);
        m2 = MediaPlayer.create(this, R.raw.two);
        m3 = MediaPlayer.create(this, R.raw.three);
        m4 = MediaPlayer.create(this, R.raw.four);
        m5 = MediaPlayer.create(this, R.raw.fv);
        m6 = MediaPlayer.create(this, R.raw.sixth);
        m7 = MediaPlayer.create(this, R.raw.seventh);
        m8 = MediaPlayer.create(this, R.raw.eighth);

//        TODO: create method with same name for all buttons
//        TODO: define a single method for playing all sound based on button id
//        TODO: make sure there is a sound for all buttons

    }

    public void playSound(View view){
        int ID = view.getId();
        switch (ID){
            case R.id.imageButton1:
                m1.start();
                break;
            case R.id.imageButton2:
                m2.start();
                break;
            case R.id.imageButton3:
                m3.start();
                break;
            case R.id.imageButton4:
                m4.start();
                break;
            case R.id.imageButton5:
                m5.start();
                break;
            case R.id.imageButton6:
                m6.start();
                break;
            case R.id.imageButton7:
                m7.start();
                break;
            case R.id.imageButton8:
                m8.start();
                break;
        }
    }
}