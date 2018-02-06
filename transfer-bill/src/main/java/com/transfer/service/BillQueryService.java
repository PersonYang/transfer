package com.transfer.service;
import com.transfer.bill.facade.request.BillQueryRequet;
import com.transfer.bill.facade.response.BillResponse;
import com.transfer.bill.facade.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by young on 2018/2/2.
 */
@Service("billQueryService")
public class BillQueryService implements BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillQueryService.class);

    @Override
    public BillResponse queryBill(BillQueryRequet billQueryRequet) {
        logger.info("=====bill-server 中 queryBill被调用 =====");
        BillResponse  billResponse = new BillResponse();
        billResponse
                .setId("123").setName("bill");
        return billResponse;
    }


}
