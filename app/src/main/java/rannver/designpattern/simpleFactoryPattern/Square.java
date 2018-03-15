package rannver.designpattern.simpleFactoryPattern;

import android.util.Log;

/**
 * Created by Rannver on 2018/3/15.
 */

public class Square implements Shape {
    @Override
    public void draw() {
        Log.d("Square", "draw");
    }
}
