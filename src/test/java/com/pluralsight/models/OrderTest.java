package com.pluralsight.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    public void getTotal_should_returnZero_forEmptyOrder() {
        // arrange
        Order order = new Order();
        // act
        double total = order.getTotal();
        // assert
        assertEquals(0.00, total);
    }
    @Test
    public void getTotal_should_returnSandwichPrice_whenOnlySandwichAdded() {
        // arrange
        Order order = new Order();
        order.addSandwich(new Sandwich("white", 8, false));
        // act
        double total = order.getTotal();
        // assert
        // 8 inch sandwich base price is $7.00
        assertEquals(7.00, total);
    }
    @Test
    public void getTotal_should_addUpAllItems_whenOrderHasSandwichDrinkAndChips() {
        // arrange
        Order order = new Order();
        order.addSandwich(new Sandwich("white", 8, false));
        order.addDrink(new Drink("medium", "cola"));
        order.addChips(new Chips("lays"));
        // act
        double total = order.getTotal();
        // assert
        // sandwich $7.00 + drink $2.50 + chips $1.50 = $11.00
        assertEquals(11.00, total);
    }
    @Test
    public void getTotal_should_addUpAllSandwiches_whenMultipleSandwichesAdded() {
        // arrange
        Order order = new Order();
        order.addSandwich(new Sandwich("white", 4, false));
        order.addSandwich(new Sandwich("wheat", 8, false));
        // act
        double total = order.getTotal();
        // assert
        // 4 inch $5.50 + 8 inch $7.00 = $12.50
        assertEquals(12.50, total);
    }
    @Test
    public void getOrderSummary_should_containSandwich_whenSandwichAdded() {
        // arrange
        Order order = new Order();
        order.addSandwich(new Sandwich("white", 8, false));
        // act
        String summary = order.getOrderSummary();
        // assert
        assertTrue(summary.contains("sandwich"));
    }
    @Test
    public void getOrderSummary_should_containDrink_whenDrinkAdded() {
        // arrange
        Order order = new Order();
        order.addDrink(new Drink("large", "lemonade"));
        // act
        String summary = order.getOrderSummary();
        // assert
        assertTrue(summary.contains("lemonade"));
    }
    @Test
    public void getOrderSummary_should_containChips_whenChipsAdded() {
        // arrange
        Order order = new Order();
        order.addChips(new Chips("doritos"));
        // act
        String summary = order.getOrderSummary();
        // assert
        assertTrue(summary.contains("doritos"));
    }
    @Test
    public void getOrderSummary_should_containTotal() {
        // arrange
        Order order = new Order();
        order.addSandwich(new Sandwich("white", 8, false));
        order.addDrink(new Drink("medium", "cola"));
        order.addChips(new Chips("lays"));
        // act
        String summary = order.getOrderSummary();
        // assert
        // summary should always show the total at the bottom
        assertTrue(summary.contains("Total"));
        assertTrue(summary.contains("11.00"));
    }

}