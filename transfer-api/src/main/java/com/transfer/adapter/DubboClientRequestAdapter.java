package com.transfer.adapter;

import com.github.kristofa.brave.ClientRequestAdapter;
import com.github.kristofa.brave.KeyValueAnnotation;
import com.github.kristofa.brave.SpanId;
import com.github.kristofa.brave.internal.Nullable;
import com.twitter.zipkin.gen.Endpoint;

import java.util.Collection;
import java.util.Map;

/**
 * Created by young on 2018/2/6.
 */
public class DubboClientRequestAdapter implements ClientRequestAdapter {

    private Map<String, String> headers;
    private String              spanName;

    public DubboClientRequestAdapter(@Nullable Map<String, String> headers,
                                     @Nullable String spanName) {
        this.headers = headers;
        this.spanName = spanName;
    }

    @Override
    public String getSpanName() {
        return this.spanName;
    }

    @Override
    public void addSpanIdToRequest(@Nullable SpanId spanId) {


    }

    @Override
    public Collection<KeyValueAnnotation> requestAnnotations() {
        return null;
    }

    @Override
    public Endpoint serverAddress() {
        return null;
    }
}
