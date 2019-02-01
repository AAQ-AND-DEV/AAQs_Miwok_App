package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

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

        ListView listView = findViewById(R.id.numbers_list);
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);
        listView.setAdapter(itemsAdapter);

    }
}
