package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.miwok.adapter.WordAdapter;
import com.example.android.miwok.pojo.Word;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersActivity extends AppCompatActivity {

    static final String TAG = "NumbersActivity.class";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<Word>
                (Arrays.asList(new Word("one", "lutti"), new Word("two", "otiiko"),new Word("three", "tolookosu"),
                        new Word("four", "oyyisa"), new Word("five", "massokka"),
                        new Word("six", "temmokka"), new Word("seven", "kenekaku"),
                        new Word("eight", "kawinta"), new Word("nine", "wo’e"), new Word("ten", "na’aacha")));
        //gives the ref to the storage location of the array
        //Log.i("NumbersActivity.class", words.toString());
        ListView listView = findViewById(R.id.numbers_list);

        WordAdapter itemsAdapter =
                new WordAdapter(this, R.layout.word_item_layout, words);
        listView.setAdapter(itemsAdapter);

    }
}
