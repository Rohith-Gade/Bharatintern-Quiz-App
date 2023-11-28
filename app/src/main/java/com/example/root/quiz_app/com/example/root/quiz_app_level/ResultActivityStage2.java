package com.example.root.quiz_app.com.example.root.quiz_app_level;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.root.quiz_app.ListActivity;
import com.example.root.quiz_app.R;

import java.io.IOException;

public class ResultActivityStage2 extends Activity
{
    TextView tv;
   // RatingBar bar;
    ImageButton img;
    ImageView ch ,con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_stage2);
        // bar=(RatingBar)findViewById(R.id.rating);
        tv = (TextView) findViewById(R.id.tv);
        // bar.setNumStars(4);
        // bar.setStepSize(1f);
        img = (ImageButton) findViewById(R.id.bt);
        con = findViewById(R.id.con);
        //get text view
        TextView t = (TextView) findViewById(R.id.textResult);
        ch=(ImageView)findViewById(R.id.im);

        //get score

        Bundle b = getIntent().getExtras();
        int score1 = b.getInt("score");
        //display score
        // bar.setRating(score1);
        switch (score1) {
            case 0:
                t.setText("Better Luck Next Time");
                tv.setText("Your score is :0");
                break;

            case 1:
                t.setText("Better Luck Next Time");
                tv.setText("Your score is :1");
                break;
            case 2:
                t.setText("Congratulations");
                tv.setText("Your score is :2");
                ch.setVisibility(View.VISIBLE);
                con.setVisibility(View.VISIBLE);
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.applause);
                mediaPlayer.start();

                break;
            //you can change the path, here path is external directory(e.g. sdcard) /Music/maine.mp3

        }
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(ResultActivityStage2.this, ListActivityStage2.class);
                    startActivity(i);
                    //finish();
                }
            });
        }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }


}

