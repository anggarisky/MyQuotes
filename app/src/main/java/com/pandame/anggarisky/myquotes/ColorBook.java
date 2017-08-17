package com.pandame.anggarisky.myquotes;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by anggarisky on 8/17/17.
 */

public class ColorBook {
    private String[] colours = {
            "#3498db",
            "#e74c3c",
            "#1abc9c",
            "#34495e",
            "#53bbb4",
    };

    int getColor() {
        Random randomColor = new Random();
        int randomColorNum = randomColor.nextInt(colours.length);
        int color = Color.parseColor(colours[randomColorNum]);
        return color;
    }
}
