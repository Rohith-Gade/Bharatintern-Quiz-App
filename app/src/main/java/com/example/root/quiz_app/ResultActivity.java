package com.example.root.quiz_app;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.root.quiz_app.com.example.root.quiz_app_level.ListActivityStage2;
import com.example.root.quiz_app.com.example.root.quiz_app_level.MainActivityStage2;

public class ResultActivity extends Activity
{
    TextView tv;
    Button button;
     int qid=0;
     ImageView btn;
     LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        RatingBar bar=(RatingBar)findViewById(R.id.ratingBar1);
        tv =(TextView)findViewById(R.id.tv);
        btn = findViewById(R.id.btn);
        linear = findViewById(R.id.linear);
        button=(Button)findViewById(R.id.result_btn);
        bar.setNumStars(3);
        bar.setStepSize(0.5f);
        final Bundle b = getIntent().getExtras();
        qid= b.getInt("list1position");

        //get text view
        TextView t=(TextView)findViewById(R.id.textResult);
        //get score
       // Bundle b = getIntent().getExtras();
        final int score= b.getInt("score");
        //display score
        bar.setRating(score);
        switch (score)
        {
            case 0:t.setText("Better Luck Next Time");
                tv.setText("Your score is :0");
                break;
                case 1:t.setText("Better Luck Next Time");
                    tv.setText("Your score is :1");
                    break;

                case 2: t.setText("Better Luck Next Time");
                tv.setText("Your score is :2");

                break;
            case 3:t.setText("Congrats enter into next level");
                tv.setText("Your score is :3");
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.applause);
                mediaPlayer.start();
                break;
                   }

                   if(score==3)
                       button.setOnClickListener(new View.OnClickListener() {
                       @Override
                       public void onClick(View v) {

                           Bundle bundle = new Bundle();
                           bundle.putInt("list1position", b.getInt("list1position")); //Your score
                           System.out.println("b.getInt"+b.getInt("list1position"));


                           Intent intent = new Intent(ResultActivity.this, MainActivityStage2.class);
                           intent.putExtras(bundle); //Put your score to your next Intent
                           startActivity(intent);
                       }
                   });
                   else
                   {
                       button.setVisibility(View.GONE);

                   }
                   if (score == 1 || score == 2 || score == 0) {
                       btn.setOnClickListener(new View.OnClickListener() {
                           @Override
                           public void onClick(View view) {
                               Intent in = new Intent(getApplicationContext(), ListActivity.class);
                               startActivity(in);
                           }
                       });
                   }else {
                       btn.setVisibility(View.GONE);
                   }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_result, menu);
        return true;
    }

}

