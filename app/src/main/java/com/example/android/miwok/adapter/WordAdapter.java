package com.example.android.miwok.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.pojo.Word;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.word_item_layout, parent, false);
        }
        Word word = getItem(position);
        TextView defaultTranslationTV = listItemView.findViewById(R.id.word_item_eng_TV);
        defaultTranslationTV.setText(word.getDefaultTranslation());
        TextView miwokTranslationTV = listItemView.findViewById(R.id.word_item_miwok_TV);
        miwokTranslationTV.setText(word.getMiwokTranslation());

        //TODO implement ImageView
        return listItemView;
    }
}
