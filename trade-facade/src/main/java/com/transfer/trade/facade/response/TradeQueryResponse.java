package com.transfer.trade.facade.response;

import java.io.Serializable;

/**
 * Created by young on 2018/2/2.
 */
public class TradeQueryResponse implements Serializable{

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public TradeQueryResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public TradeQueryResponse setName(String name) {
        this.name = name;
        return this;
    }
}
