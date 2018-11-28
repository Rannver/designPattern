package rannver.designpattern.proxyPattern;

public class RealSubject implements Subject{
    @Override
    public String buyMac() {
        return "买一台mac";
    }
}
