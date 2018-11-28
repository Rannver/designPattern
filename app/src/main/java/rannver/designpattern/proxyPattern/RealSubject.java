package rannver.designpattern.proxyPattern;

public class RealSubject implements Subject{
    @Override
    public void buyMac() {
        System.out.println("买一台mac");
    }
}
