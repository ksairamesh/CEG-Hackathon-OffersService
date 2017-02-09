package com.ciat.component;

/**
 * Created by ksairamesh on 2/8/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Offer {



    private String sku;
    private String productName;
    private List<AvailableOffer> availableOffers;


    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<AvailableOffer> getAvailableOffers() {
        return availableOffers;
    }

    public void setAvailableOffers(List<AvailableOffer> availableOffers) {
        this.availableOffers = availableOffers;
    }

}
