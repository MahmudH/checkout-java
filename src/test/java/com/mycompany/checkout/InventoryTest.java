//package com.mycompany.checkout;
//
//import org.junit.Test;
//
//import java.util.Map;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.collection.IsMapContaining.hasEntry;
//
//public class InventoryTest {
//    @Test
//    public void checkingThatProductAExistsInsideInventory() {
//        Inventory inventory = new Inventory();
//        Map<String, Integer> products = inventory.getProducts();
//
//        assertThat(products, hasEntry("Apple", 50));
//        assertThat(products, hasEntry("Banana", 30));
//        assertThat(products, hasEntry("Cookie", 20));
//        assertThat(products, hasEntry("Drink", 15));
//    }
//
//    @Test
//    public void canAddAProductToInventory() {
//        Inventory inventory = new Inventory();
//        inventory.addProduct("Grapes", 25);
//        Map<String, Integer> products = inventory.getProducts();
//        assertThat(products, hasEntry("Grapes", 25));
//    }
//
//}
