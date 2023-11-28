package com.example.root.quiz_app.com.example.root.quiz_app_level;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.root.quiz_app.MainActivity;
import com.example.root.quiz_app.R;

public class ListActivityStage2 extends Activity
{
    ListView lv;
    String items[] = {"QUIZ-1","QUIZ-2","QUIZ-3","QUIZ-4","QUIZ-5","QUIZ-6","QUIZ-7","QUIZ-8","QUIZ-9","QUIZ-10","QUIZ-11","QUIZ-12","QUIZ-13","QUIZ-14","QUIZ-15","QUIZ-16","QUIZ-17","QUIZ-18","QUIZ-19","QUIZ-20","QUIZ-21","QUIZ-22","QUIZ-23","QUIZ-24","QUIZ-25","QUIZ-26","QUIZ-27","QUIZ-28","QUIZ-29","QUIZ-30","QUIZ-31","QUIZ-32","QUIZ-33","QUIZ-34","QUIZ-35","QUIZ-36","QUIZ-37","QUIZ-38","QUIZ-39","QUIZ-40","QUIZ-41","QUIZ-42","QUIZ-43","QUIZ-44","QUIZ-45","QUIZ-46","QUIZ-47","QUIZ-48","QUIZ-49","QUIZ-50","QUIZ-51","QUIZ-52","QUIZ-53","QUIZ-54","QUIZ-55","QUIZ-56","QUIZ-57","QUIZ-58","QUIZ-59","QUIZ-60"};

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = (ListView)findViewById(R.id.lv);
        textView = findViewById(R.id.id);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,items);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Intent i = new Intent(ListActivityStage2.this,MainActivity.class);
                Bundle b = new Bundle();
                b.putInt("list1position", position);
                i.putExtras(b); //Put your score to your next Intent
                startActivity(i);
            }
        });
        scrollViewText();
    }
     public void scrollViewText() {
    int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW}; // Add more colors as needed
    String scrollMsg = "Quiz Application";
    long animationDurationMillis = 6000L * colors.length; // Total duration for all rotations

    textView.setText(scrollMsg);

    ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
    animator.setInterpolator(new LinearInterpolator());
    animator.setDuration(animationDurationMillis);

    animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
        @Override
        public void onAnimationUpdate(ValueAnimator animation) {
            final float progress = (float) animation.getAnimatedValue();
            final int colorIndex = (int) ((progress * colors.length) % colors.length);
            final int currentColor = colors[colorIndex];

            SpannableString spannableString = new SpannableString(scrollMsg);
            ForegroundColorSpan colorSpan = new ForegroundColorSpan(currentColor);
            spannableString.setSpan(colorSpan, 0, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

            textView.setText(spannableString);

            final float width = textView.getWidth();
            final float translationX = width * progress; // Change this line
            textView.setTranslationX(translationX);
        }
    });

    animator.setRepeatCount(ValueAnimator.INFINITE);
    animator.start();
}


}
