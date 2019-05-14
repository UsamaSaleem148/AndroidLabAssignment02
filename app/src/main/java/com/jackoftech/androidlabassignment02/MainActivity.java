package com.jackoftech.androidlabassignment02;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler hand = new Handler();
    TextView timer, txt;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer = findViewById(R.id.timer);
        img = findViewById(R.id.img);
        txt = findViewById(R.id.txt);

        hand.postDelayed(run, 1000);
    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            updateTimer();
        }
    };

    public void updateTimer(){
        timer.setText(""+(Integer.parseInt(timer.getText().toString())-1));

        if (Integer.parseInt(timer.getText().toString())==0){
            img.setVisibility(View.VISIBLE);
            txt.setVisibility(View.VISIBLE);
        }
        else{
            hand.postDelayed(run, 1000);
        }
    }
}
