package com.transfer.filter;

import com.alibaba.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * rpc filter
 * Created by young on 2018/2/6.
 */
public class TraceProviderFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(TraceProviderFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {


        return null;
    }




}
