package com.transfer.bill.facade.service;

import com.transfer.bill.facade.request.BillQueryRequet;
import com.transfer.bill.facade.response.BillResponse;

/**
 * Created by young on 2018/2/2.
 */
public interface BillService {
    BillResponse queryBill(BillQueryRequet billQueryRequet);
}
