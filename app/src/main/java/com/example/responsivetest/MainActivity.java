package com.example.responsivetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.view.WindowManager;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final TextView head;
        final LottieAnimationView loader,tictac;

        head=findViewById(R.id.header);
        loader=findViewById(R.id.load);
        tictac=findViewById(R.id.tictac);

        head.animate().translationY(Resources.getSystem().getDisplayMetrics().heightPixels).setDuration(3000).setStartDelay(8000);
        loader.animate().translationY(Resources.getSystem().getDisplayMetrics().heightPixels).setDuration(3000).setStartDelay(8000);
        tictac.animate().translationY(Resources.getSystem().getDisplayMetrics().heightPixels).setDuration(3000).setStartDelay(8000);

        //Intent in=new Intent(MainActivity.this,Hompage.class);
        //startActivity(in);
        //finish();

        Timer t=new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent in=new Intent(MainActivity.this,Hompage.class);
                startActivity(in);
                finish();
            }
        },10000);



    }
}