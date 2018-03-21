package com.spring.aop;

/**
 * Created by qidd on 2018-3-21
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy(new RealSubject());
        subject.request();
    }
}
