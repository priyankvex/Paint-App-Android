package com.wordpress.priyankvex.paintapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Priyank(@priyankvex) on 5/9/15.
 *
 * Class which provides the view on which drawing takes place.
 */
public class DrawingView extends View{

    public DrawingView(Context context, AttributeSet attrs){
        super(context, attrs);
        setUpDrawing();
    }

    /**
     * Initialize all objects required for drawing here.
     * One time initialization reduces resource consumption.
     */
    private void setUpDrawing(){

    }
}
