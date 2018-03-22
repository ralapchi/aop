package com.spring.chain;

import java.util.List;

/**
 * Created by qidd on 2018-3-21
 */
public class Chain {
    private List<ChainHandler> chainHandlerList;

    private int index = 0;

    public Chain(List<ChainHandler> chainHandlerList) {
        this.chainHandlerList = chainHandlerList;
    }

    public void proceed() {
        if (index >= chainHandlerList.size()) {
            return;
        }
        chainHandlerList.get(index++).execute(this);

    }
}
