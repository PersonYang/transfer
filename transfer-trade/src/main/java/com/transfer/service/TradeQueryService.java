package com.transfer.service;

import com.transfer.bill.facade.request.BillQueryRequet;
import com.transfer.bill.facade.response.BillResponse;
import com.transfer.bill.facade.service.BillService;
import com.transfer.trade.facade.request.TradeQueryRequest;
import com.transfer.trade.facade.response.TradeQueryResponse;
import com.transfer.trade.facade.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by young on 2018/2/2.
 */
@Service("tradeQueryService")
public class TradeQueryService implements TradeService {

    private static final Logger logger = LoggerFactory.getLogger(TradeQueryService.class);

    @Autowired
    BillService billService;

    @Override
    public TradeQueryResponse queryTrade(TradeQueryRequest tradeQueryRequest) {
        logger.info("===== trade-server 中 queryTrade 被调用 =====");
        BillQueryRequet billQueryRequet = new BillQueryRequet();
        TradeQueryResponse tradeQueryResponse = new TradeQueryResponse();
        billQueryRequet.setId("123").setName("from trade ");
        BillResponse billResponse = billService.queryBill(billQueryRequet);
        tradeQueryResponse.setId(billResponse.getId()).setName(billResponse.getName());
        return tradeQueryResponse;
    }
}
