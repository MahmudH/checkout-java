package com.mycompany.checkout;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by mahmudhussain on 17/05/2016.
 */
public class CheckoutTest {

    @Before
    public void setUpCheckout(){
        PricingRules pricingRules = new PricingRules();
        Checkout checkout = new Checkout(pricingRules);
    }

    @Test
    public void whenNoItemsHasBeenScannedTotalShouldBeZero(){
        assertThat(checkout.total(), is(0));
    }

   /* @Test
    public void whenItemHasBeenScannedTotalShouldBePriceOfTheItem(){
        checkout.scan("apple");
        assertThat(checkout.total(), is(10));
    }*/
}
