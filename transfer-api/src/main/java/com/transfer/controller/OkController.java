package com.transfer.controller;

import com.transfer.trade.facade.request.TradeQueryRequest;
import com.transfer.trade.facade.response.TradeQueryResponse;
import com.transfer.trade.facade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by young on 2018/2/5.
 */
@RestController
@RequestMapping("/api")
public class OkController {



    private Random random = new Random();

    @Autowired
    TradeService tradeService;

    @RequestMapping("/ok")
    public TradeQueryResponse ok(){


        TradeQueryRequest queryRequest = new TradeQueryRequest();
        queryRequest.setId("1").setName("api-server");
        TradeQueryResponse response = tradeService.queryTrade(queryRequest);
        return response;
    }

}
