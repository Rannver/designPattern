package rannver.designpattern.builderPattern;

/**
 * Created by Rannver on 2018/3/14.
 */

public class Macbook extends Computer {

    protected Macbook(){};

    @Override
    public void setOs() {
        os = "Mac OS";
    }
}
