package com.example.root.quiz_app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    List<Question> quesList;
    int score=0;
    int qid=0,q_no=1,qid_final=0;
    Question currentQ;
    TextView txtQuestion,timerText;
    RadioButton rda, rdb, rdc,rdd;
    Button butNext;
    RadioGroup grp;
    TextView tv_timecount;
    int count ;
    RadioButton answer;
    Context mContext;
    String str;
    CountDownTimer mCountDownTimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar  = getSupportActionBar();
        actionBar.setTitle("Quiz Application");
        actionBar.setSubtitle("Level-1");
        tv_timecount = (TextView) findViewById(R.id.tv_timecount);
        final Bundle b = getIntent().getExtras();
        qid= b.getInt("list1position");
                    qid=qid*3;


        qid_final=qid+3;
        DbHelper db = new DbHelper(this);
        quesList = db.getAllQuestions();
        currentQ = quesList.get(qid);
        txtQuestion = (TextView) findViewById(R.id.textView1);
        rda = (RadioButton) findViewById(R.id.radio0);
        rdb = (RadioButton) findViewById(R.id.radio1);
        rdc = (RadioButton) findViewById(R.id.radio2);
        rdd = (RadioButton) findViewById(R.id.radio3);
        butNext = (Button) findViewById(R.id.button1);
        grp = (RadioGroup) findViewById(R.id.radioGroup1);

        rda.setChecked(false);
        rdb.setChecked(false);
        rdc.setChecked(false);
        rdd.setChecked(false);

//        ActionBar mActionBar = getActionBar();
//        mActionBar.setDisplayShowHomeEnabled(false);
//        mActionBar.setDisplayShowTitleEnabled(false);
//        LayoutInflater mInflater = LayoutInflater.from(this);
//
//        View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
//        TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
//        mTitleTextView.setText("Visiontek");

        mContext = this;
        setQuestionView();
       /* mCountDownTimer =new CountDownTimer(40000, 1000) {
            public void onTick(long millisUntilFinished) {
                // mTextField.setTextContent("seconds remaining: " + millisUntilFinished / 1000);
                //  Toast.makeText(getApplicationContext(), "1", 1000).show();

                tv_timecount.setText("" + millisUntilFinished / 1000);
            }

            @Override
            public void onFinish() {

                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);
                alert.setTitle("Quiz");
                alert.setMessage("Time UP");
                alert.setCancelable(false);
                alert.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();

                            }
                        });

                alert.show();
                tv_timecount.setText("done!");
                //   mTextField.setTextContent("done!");



            }

        }.start();


*/
        butNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




               // Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show(); // print the value of selected super star }



                if(grp!=null) {
                     answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                    if (rda.isChecked()) {
                        str = rda.getText().toString();
                    } else if (rdb.isChecked()) {
                        str = rdb.getText().toString();
                    } else if (rdc.isChecked()) {
                        str = rdc.getText().toString();
                    } else if (rdd.isChecked()) {
                        str = rdd.getText().toString();
                    }
                    grp.clearCheck();
                    if (answer!=null) {
                        Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());
                        if (currentQ.getANSWER().trim().equals(answer.getText().toString().trim())) {
                            score++;
                            Log.d("score", "Your score" + score);

                        }

                        if (qid < qid_final) {
                            ++q_no;
                            currentQ = quesList.get(qid);
                            setQuestionView();
                        } else {
                            q_no=1;
                            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                            Bundle bundle = new Bundle();
                            bundle.putInt("list1position", b.getInt("list1position")); //Your score
                            bundle.putInt("score", score); //Your score

                            intent.putExtras(bundle); //Put your score to your next Intent
                            startActivity(intent);
                            finish();
                        }
                    } else {
                        Toast.makeText(MainActivity.this, "Please Select Option", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity.this, "Please Select Option", Toast.LENGTH_SHORT).show();
                }
            }
        });
       // mActionBar.setCustomView(mCustomView);
        //mActionBar.setDisplayShowCustomEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.timer_action, menu);
        MenuItem timerItem = menu.findItem(R.id.break_timer);
        timerText = (TextView) MenuItemCompat.getActionView(timerItem);

        timerText.setPadding(10, 0, 10, 0); //Or something like that...

        // mCountDownTimer(30000, 1000); //One tick every second for 30 seconds
        mCountDownTimer = new CountDownTimer(40000, 1000) {
            @Override
            public void onTick(long l) {
                tv_timecount.setText("" + l / 1000);

            }

            @Override
            public void onFinish() {


                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);
                alert.setTitle("Quiz");
                alert.setMessage("Time UP");
                alert.setCancelable(false);
                alert.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                                if(grp!=null) {
                                    answer = (RadioButton) findViewById(grp.getCheckedRadioButtonId());
                                    if (rda.isChecked()) {
                                        str = rda.getText().toString();
                                    } else if (rdb.isChecked()) {
                                        str = rdb.getText().toString();
                                    } else if (rdc.isChecked()) {
                                        str = rdc.getText().toString();
                                    } else if (rdd.isChecked()) {
                                        str = rdd.getText().toString();
                                    }

                                    if (answer != null) {
                                        Log.d("yourans", currentQ.getANSWER() + " " + answer.getText());
                                        if (currentQ.getANSWER().equals(answer.getText())) {
                                            score++;
                                            Log.d("score", "Your score" + score);

                                        }
                                        q_no=1;

                                            Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                                            Bundle b = new Bundle();
                                            b.putInt("score", score); //Your score
                                            intent.putExtras(b); //Put your score to your next Intent
                                            startActivity(intent);
                                            finish();

                                    }else{
                                        q_no=1;
                                        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                                        Bundle b = new Bundle();
                                        b.putInt("score", score); //Your score
                                        intent.putExtras(b); //Put your score to your next Intent
                                        startActivity(intent);
                                        finish();
                                    }
                                }else{
                                    q_no=1;
                                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                                    Bundle b = new Bundle();
                                    b.putInt("score", score); //Your score
                                    intent.putExtras(b); //Put your score to your next Intent
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });

                alert.show();
                tv_timecount.setText("done!");
                //   mTextField.setTextContent("done!");


            }

        }.start();

        return true;
    }
    private void setQuestionView()
    {

        grp.setEnabled(false);

        txtQuestion.setText(q_no+"."+currentQ.getQUESTION());
        rda.setText(currentQ.getOPTA());
        rdb.setText(currentQ.getOPTB());
        rdc.setText(currentQ.getOPTC());
        rdd.setText(currentQ.getOPTD());
        qid++;
    }
    @Override
    protected void onStop() {
        super.onStop();
        mCountDownTimer.cancel();
    }
}
