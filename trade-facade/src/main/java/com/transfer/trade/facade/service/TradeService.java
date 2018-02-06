package com.transfer.trade.facade.service;

import com.transfer.trade.facade.request.TradeQueryRequest;
import com.transfer.trade.facade.response.TradeQueryResponse;

/**
 * Created by young on 2018/2/2.
 */
public interface TradeService {

    TradeQueryResponse queryTrade(TradeQueryRequest tradeQueryRequest);
}
