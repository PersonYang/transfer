package com.transfer.bill.facade.response;

import java.io.Serializable;

/**
 * Created by young on 2018/2/2.
 */
public class BillResponse implements Serializable {


    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public BillResponse setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BillResponse setName(String name) {
        this.name = name;
        return this;
    }
}
