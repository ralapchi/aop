package com.spring.thread;

/**
 * Created by qidd on 2018-3-22
 */
public class MyThread {
    public static void main(String[] args) {
        Demo T1 = new Demo("Thread-1");
        T1.start();

        Demo T2 = new Demo("Thread-2");
        T2.start();
    }
}

class Demo implements Runnable {

    private Thread t;
    private String threadName;

    Demo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 10; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
