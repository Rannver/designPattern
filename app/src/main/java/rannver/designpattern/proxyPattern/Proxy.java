package rannver.designpattern.proxyPattern;

public class Proxy implements Subject {
    @Override
    public String buyMac() {
        //创建引用真实对象实例
        RealSubject realSubject = new RealSubject();
        //调用真实对象的方法
        String s = realSubject.buyMac();

        //代理对象自己的额外操作
        s = wrap(s);
        return s;
    }

    private String wrap(String text){
        return text+"，黑五折扣买";
    }
}
