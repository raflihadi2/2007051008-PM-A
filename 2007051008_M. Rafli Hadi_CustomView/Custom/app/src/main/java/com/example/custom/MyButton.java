package com.example.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

import androidx.core.content.ContextCompat;

public class MyButton extends androidx.appcompat.widget.AppCompatButton
{
    private Drawable enabledBackground, disabledBackground;
    private int textColor;
    public MyButton(Context context) {
        super(context);
        init();
    }
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public MyButton(Context context, AttributeSet attrs, int
            defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        setBackground(isEnabled() ? enabledBackground :
                disabledBackground);
        setTextColor(textColor);
        setTextSize(17.f);
        setGravity(Gravity.CENTER);
        setText(isEnabled() ? "Submit" : "Isi Dahulu");
    }
    private void init(){
        textColor = ContextCompat.getColor(getContext(),
                android.R.color.background_light);
        enabledBackground =
                getResources().getDrawable(R.drawable.bg_button);
        disabledBackground =
                getResources().getDrawable(R.drawable.bg_button_disable);
    }
}
