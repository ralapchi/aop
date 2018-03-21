package com.spring.dynamic;

import com.spring.aop.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by qidd on 2018-3-21
 */
public class JkdProxyDynamic implements InvocationHandler {
    private RealSubject realSubject;

    public JkdProxyDynamic(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("###before");
        Object reslut = null;
        try {
            method.invoke(realSubject, args);
        } catch (Exception e) {
            System.out.println("###exception" + e.getMessage());
            throw e;

        } finally {
            System.out.println("###finally");
        }

        return reslut;
    }
}
