package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    static final String TAG = "NumbersActivity.class";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<String> words = new ArrayList<String>
                (Arrays.asList("one", "two", "three", "four", "five",
                        "six", "seven", "eight", "nine", "ten"));
        //gives the ref to the storage location of the array
        Log.i("NumbersActivity.class", words.toString());
        /*
        for (String word: words
             ) {
            Log.i("numbersAct.class", word);
        }*/
        for (int i = 0; i<words.size(); i++){
            Log.v(TAG, "word at index " + i + " is " + words.get(i));
        }
    }
}
