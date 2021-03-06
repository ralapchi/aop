package com.spring.chain;

/**
 * Created by qidd on 2018-3-21
 */
public class Client {
    static class HandlerA extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by a");

        }
    }

    static class HandlerB extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by b");
        }
    }

    static class HandlerC extends Handler {
        @Override
        protected void handleProcess() {
            System.out.println("handle by c");
        }
    }

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        Handler handlerC = new HandlerC();

        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        handlerA.execute();
    }
}
