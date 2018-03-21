package com.spring.dynamic;

import com.spring.aop.RealSubject;
import com.spring.aop.Subject;

import java.lang.reflect.Proxy;

/**
 * Created by qidd on 2018-3-21
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{Subject.class}, new JkdProxyDynamic(new RealSubject()));
        subject.hello();
    }
}
