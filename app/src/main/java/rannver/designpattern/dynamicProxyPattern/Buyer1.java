package rannver.designpattern.dynamicProxyPattern;

/**
 * Created by huangqianying on 2018/11/28 19:52
 */
public class Buyer1 implements Subject {
    @Override
    public String buy() {
        return "A buy Mac";
    }
}
