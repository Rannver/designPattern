package rannver.designpattern.builderPattern;

/**
 * Created by Rannver on 2018/3/14.
 */

public abstract class Builder {

    //设置主机
    public abstract Builder buildBoard(String board);

    //设置显示器
    public abstract Builder buildDisplay(String display);

    //设置操作系统
    public abstract Builder buildOS();

    //创建电脑
    public abstract Computer create();

}
