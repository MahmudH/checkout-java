package com.mycompany.checkout;

public class SpecialPrice {

    private Integer qty;
    private Integer price;

    public SpecialPrice(Integer qty, Integer price) {
        this.qty = qty;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getQty() {
        return qty;
    }
}
