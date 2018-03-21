package com.spring.chain;

/**
 * Created by qidd on 2018-3-21
 */
public abstract class ChainHandler {

    public void execute(Chain chain) {
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();
}
