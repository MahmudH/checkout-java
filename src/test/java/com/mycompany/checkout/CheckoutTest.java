package com.mycompany.checkout;

import com.sun.org.apache.bcel.internal.generic.CHECKCAST;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CheckoutTest {

    private Checkout checkout;

    @Before
    public void setUpCheckout() {
        PricingRules pricingRules = new PricingRules();
        checkout = new Checkout(pricingRules);
    }

    @Test
    public void whenNoItemsHasBeenScannedTotalShouldBeZero() {
        assertThat(checkout.total(), is(0));
    }

    @Test
    public void whenItemHasBeenScannedTotalShouldBePriceOfTheItem() {
        checkout.scan("A");
        assertThat(checkout.total(), is(50));
    }

    @Test
    public void whenTwoDifferentItemsHaveBeenScannedTotalShouldBePriceOfBothTheItems() {
        checkout.scan("A");
        checkout.scan("B");
        assertThat(checkout.total(), is(80));
    }

    @Test
    public void whenAllTheAvailiableItemsHaveBeenScannedTotalShouldBePriceOfAllTheItems() {
        checkout.scan("A");
        checkout.scan("B");
        checkout.scan("C");
        checkout.scan("D");
        assertThat(checkout.total(), is(115));
    }

    @Test
    public void whenThreeAScannedSpecialPriceShouldApply() {
        checkout.scan("A");
        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total(), is(130));
    }

    @Test
    public void whenTwoOfTheSameItemsScannedShouldBeCorrectTotal() {
        checkout.scan("A");
        checkout.scan("A");
        assertThat(checkout.total(), is(100));
    }

    @Test
    public void whenBScannedTwiceShouldBeCorrectTotal() {
        checkout.scan("B");
        checkout.scan("B");
        assertThat(checkout.total(), is(45));
    }
}
