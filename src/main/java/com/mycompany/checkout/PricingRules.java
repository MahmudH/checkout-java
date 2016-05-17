package com.mycompany.checkout;

import java.util.HashMap;
import java.util.Map;

public class PricingRules {

    Map<String, Integer> itemUnitPrice = new HashMap<String, Integer>(){{
        put("A", 50);
        put("B", 30);
        put("C", 20);
        put("D", 15);
    }};


    Map<String, SpecialPrice> itemSpecialPrice = new HashMap<String, SpecialPrice>(){{
        put("A", new SpecialPrice(3, 130));
        put("B", new SpecialPrice(2, 45));
    }};
}
