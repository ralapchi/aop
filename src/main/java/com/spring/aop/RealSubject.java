package com.spring.aop;

/**
 * Created by qidd on 2018-3-21
 */
public class RealSubject implements  Subject {

    @Override
    public void request() {
        System.out.println("real subject excute request" );
    }

    @Override
    public void hello() {
        System.out.println("real subject excute hello" );
    }
}
