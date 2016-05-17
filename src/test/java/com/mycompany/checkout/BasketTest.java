package com.mycompany.checkout;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.hasEntry;

public class BasketTest {
    @Test
    public void canScanAndAddAProductToTheBasket() {
        Basket basket = new Basket();
        Map<String, Integer> contents = basket.showBasket();
        basket.scan("Apple", 1);
        assertThat(contents, hasEntry("Apple", 1));
    }
}