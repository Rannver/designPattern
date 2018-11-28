package rannver.designpattern.proxyPattern;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        //创建引用真实对象实例
        RealSubject realSubject = new RealSubject();
        //调用真实对象的方法
        realSubject.buyMac();

        //代理对象自己的额外操作
        wrap();
    }

    private void wrap(){
        System.out.println("黑五折扣买");
    }
}
