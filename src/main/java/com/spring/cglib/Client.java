package com.spring.cglib;

import com.spring.aop.RealSubject;
import com.spring.aop.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by qidd on 2018-3-21
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
