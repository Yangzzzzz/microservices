package com.micro.web.dao;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProBuilder implements InvocationHandler{

    Object tar =null ;

    public ProBuilder(){}
    public ProBuilder(Object object){
        this.tar = object;
    }

    public Object bind(){
        Object pro = Proxy.newProxyInstance(tar.getClass().getClassLoader(),tar.getClass().getInterfaces(),this);
        return pro;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object obj = method.invoke(tar,args);
        System.out.println("after");
        return obj;
    }

}
