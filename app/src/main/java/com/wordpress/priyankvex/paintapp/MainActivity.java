package com.wordpress.priyankvex.paintapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private DrawingView mDrawingView;
    private ImageButton currPaint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawingView = (DrawingView)findViewById(R.id.drawing);
        // Getting the initial paint color.
        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.paint_colors);
        // 0th child is white color, so selecting first child to give black as initial color.
        currPaint = (ImageButton)paintLayout.getChildAt(1);
        currPaint.setImageDrawable(getResources().getDrawable(R.drawable.pallet_pressed));

    }

    /**
     * Method is called when color is clicked from pallet.
     * @param view ImageButton on which click took place.
     */
    public void paintClicked(View view){
        if (view != currPaint){
            // Update the color
            ImageButton imageButton = (ImageButton) view;
            String colorTag = imageButton.getTag().toString();
            mDrawingView.setColor(colorTag);
            // Swap the backgrounds for last active and currently active image button.
            imageButton.setImageDrawable(getResources().getDrawable(R.drawable.pallet_pressed));
            currPaint.setImageDrawable(getResources().getDrawable(R.drawable.pallet));
            currPaint = (ImageButton)view;
        }
    }

}
