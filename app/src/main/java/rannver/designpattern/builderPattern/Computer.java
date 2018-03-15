package rannver.designpattern.builderPattern;

/**
 * Created by Rannver on 2018/3/14.
 */

public abstract class Computer {

    protected String board;
    protected String display;
    protected String os;

    protected Computer(){}

    public void setBoard(String board) {
        this.board = board;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public abstract void setOs();//设置操作系统的抽象类

    @Override
    public String toString() {
        return "Computer: board:"+board+",display:"+display+",os:"+os;
    }
}
