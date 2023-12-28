package com.safe2pay.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseSafe2Pay<T> {

    @JsonProperty("HasError")
    private boolean hasError;
    @JsonProperty("ResponseDetail")
    private T responseDetail;

    public boolean isHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public T getResponseDetail() {
        return responseDetail;
    }

    public void setResponseDetail(T responseDetail) {
        this.responseDetail = responseDetail;
    }
}

