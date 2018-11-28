package rannver.designpattern.dynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 *生成动态代理对象，需要实现InvocationHandler接口
 */
public class DynamicProxy implements InvocationHandler {

    //声明代理对象，
    private Object mProxyObject;

    public Object newProxyInstance(Object proxyObject){
        this.mProxyObject = proxyObject;
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader(),proxyObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        result = method.invoke(mProxyObject,args);
        return result;
    }
}
