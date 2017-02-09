package com.ciat.component;

import java.util.List;

/**
 * Created by ksairamesh on 2/8/17.
 */
public class Response {

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    private int statusCode;
    private String status;

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    private Offer offer;
}
