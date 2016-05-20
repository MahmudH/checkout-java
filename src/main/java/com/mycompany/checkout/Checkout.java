package com.mycompany.checkout;

import java.util.HashMap;
import java.util.Map;

public class Checkout {

    private PricingRules pricingRules;
    private Map<String, Integer> basket = new HashMap<String, Integer>();
    private int sum = 0;

    public Checkout(PricingRules pricingRules) {
        this.pricingRules = pricingRules;
    }

    public int total() {
        for (Map.Entry<String, Integer> basketEntry : basket.entrySet()) {
            SpecialPrice specialPrice = pricingRules.itemSpecialPrice.get(basketEntry.getKey());
            if (pricingRules.itemSpecialPrice.containsKey(basketEntry.getKey()) && basketEntry.getValue() >= specialPrice.getQty()) {
                sum += specialPrice.getPrice();

            } else {
                sum += (pricingRules.itemUnitPrice.get(basketEntry.getKey()) * basketEntry.getValue());
            }
        }
        return sum;
    }

    public void scan(String productName) {
        if (basket.containsKey(productName)) {
            basket.put(productName, basket.get(productName) + 1);
        } else {
            basket.put(productName, 1);
        }
    }
}
