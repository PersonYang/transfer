package com.transfer.bill.facade.request;

import java.io.Serializable;

/**
 * Created by young on 2018/2/2.
 */
public class BillQueryRequet implements Serializable {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public BillQueryRequet setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BillQueryRequet setName(String name) {
        this.name = name;
        return this;
    }
}
