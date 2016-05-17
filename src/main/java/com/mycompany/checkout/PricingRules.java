package com.mycompany.checkout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mahmudhussain on 17/05/2016.
 */
public class PricingRules {

    Map<String, Integer> itemUnitPrice = new HashMap<String, Integer>(){{
        put("A", 50);
        put("B", 50);
        put("C", 50);
        put("D", 50);
    }};


    Map<String, Integer> itemSpecialPrice = new HashMap<String, Integer>(){{
        put("A", new SpecialPrice(3, 130));
        put("B", new SpecialPrice(2, 45));
    }};
}