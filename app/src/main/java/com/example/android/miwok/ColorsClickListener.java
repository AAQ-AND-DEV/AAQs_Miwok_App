package com.example.android.miwok;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class ColorsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent colorsIntent = new Intent(v.getContext(), ColorsActivity.class);

        v.getContext().startActivity(colorsIntent);
    }
}
