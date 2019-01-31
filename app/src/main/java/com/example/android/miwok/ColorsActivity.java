package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<String> words = new ArrayList<String>();
        words.add("red");
        words.add("mustard yellow");
        words.add("dusty yellow");
        words.add("green");
        words.add("brown");
        words.add("gray");
        words.add("black");
        words.add("white");

        LinearLayout colorsLO = findViewById(R.id.colors_root_LO);
        for (int i = 0; i<words.size(); i++){
            TextView tv = new TextView(this);
            tv.setText(words.get(i));
            colorsLO.addView(tv, i);
        }
    }
}
