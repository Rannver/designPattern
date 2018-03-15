package rannver.designpattern.simpleFactoryPattern;

import android.util.Log;

/**
 * Created by Rannver on 2018/3/15.
 */

public class Rectangle implements Shape {
    @Override
    public void draw() {
        Log.d("Rectangle", "draw");
    }
}
