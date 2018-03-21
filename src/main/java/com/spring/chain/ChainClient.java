package com.spring.chain;

import java.util.Arrays;
import java.util.List;

/**
 * Created by qidd on 2018-3-21
 */
public class ChainClient {
    static class ChainhandlerA extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle process  a");
        }
    }

    static class ChainhandlerB extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle process  b");
        }
    }

    static class ChainhandlerC extends ChainHandler {
        @Override
        protected void handleProcess() {
            System.out.println("handle process  c");
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> chainHandlerList = Arrays.asList(
                new ChainhandlerA(),
                new ChainhandlerB(),
                new ChainhandlerC()
        );
        Chain chain = new Chain(chainHandlerList);
        chain.proceed();
    }
}
