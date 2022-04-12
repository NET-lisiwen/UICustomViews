package com.example.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * TODO: document your custom view class.
 */
public class TitleLayout extends LinearLayout implements View.OnClickListener {

    public TitleLayout(Context context) {
        super(context);
        init(context);
    }

    public TitleLayout(Context context, AttributeSet attrs) {
        this(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.title, this);
        findViewById(R.id.backbutton).setOnClickListener(this);
        findViewById(R.id.savebutton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backbutton:
                Toast.makeText(getContext(), "click back button", Toast.LENGTH_SHORT).show();
                if (getContext() instanceof Activity) {
                    ((Activity) getContext()).finish();
                }
                break;
            case R.id.savebutton:
                Toast.makeText(getContext(), "click save button", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(getContext(), "click default button", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}