package com.example.xyzreader.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Amr Ayoub on 5/11/2017.
 */

public class ThreeTwoImageView extends ImageView {
    public ThreeTwoImageView(Context context) {
        super(context);
    }

    public ThreeTwoImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threetwoheight = MeasureSpec.getSize(widthMeasureSpec)* 2/3;
        int threetwoHighSpec = MeasureSpec.makeMeasureSpec(threetwoheight,MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threetwoHighSpec);
    }
}

