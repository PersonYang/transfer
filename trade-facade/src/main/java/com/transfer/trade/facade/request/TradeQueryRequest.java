package com.transfer.trade.facade.request;

import java.io.Serializable;

/**
 * Created by young on 2018/2/2.
 */
public class TradeQueryRequest implements Serializable{


    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public TradeQueryRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TradeQueryRequest setName(String name) {
        this.name = name;
        return this;
    }
}
