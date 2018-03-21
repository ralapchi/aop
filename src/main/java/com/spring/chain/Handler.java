package com.spring.chain;

/**
 * Created by qidd on 2018-3-21
 */
public abstract class Handler {
    private Handler successor;

    protected abstract void handleProcess();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void execute() {
        handleProcess();
        if (successor != null)
            successor.execute();
    }
}
