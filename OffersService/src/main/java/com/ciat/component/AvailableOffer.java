package com.ciat.component;

/**
 * Created by ksairamesh on 2/8/17.
 */
public class AvailableOffer {
    /*
        "vendorName":"Zales",
          "price":"584",
          "avaialbleQuantity":"3",
          "product_id":"ZL-Braclet-110"
     */

    private String vendorName;
    private double price;
    private int quantity;
    private String product_id;


    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

}
