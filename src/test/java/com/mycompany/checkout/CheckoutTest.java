package com.mycompany.checkout;

import com.sun.org.apache.bcel.internal.generic.CHECKCAST;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckoutTest {

    private Checkout checkout;

    @Before
    public void setUpCheckout(){
        PricingRules pricingRules = new PricingRules();
        checkout = new Checkout(pricingRules);
    }

    @Test
    public void whenNoItemsHasBeenScannedTotalShouldBeZero(){
        assertThat(checkout.total(), is(0));
    }

//    @Test
//    public void whenItemHasBeenScannedTotalShouldBePriceOfTheItem(){
//        checkout.scan("A");
//        assertThat(checkout.total(), is(50));
//    }
}
