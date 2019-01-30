package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

public class ColorsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),
            "open colors list", Toast.LENGTH_SHORT)
                .show();
    }
}
