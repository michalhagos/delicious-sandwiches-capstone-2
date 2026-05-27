package com.pluralsight.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DrinkTest {
    @Test
    public void getPrice_should_returnTwoDollars_forSmallDrink() {
        // arrange
        Drink drink = new Drink("small", "cola");
        // act
        double price = drink.getPrice();
        // assert
        assertEquals(2.00, price);
    }
    @Test
    public void getSummary_should_showSizeAndFlavor() {
        // arrange
        Drink drink = new Drink("medium", "lemonade");
        // act
        String summary = drink.getSummary();
        // assert
        assertTrue(summary.contains("medium"));
        assertTrue(summary.contains("lemonade"));
    }
    @Test
    public void getSummary_should_showCorrectPrice() {
        // arrange
        Drink drink = new Drink("large", "water");
        // act
        String summary = drink.getSummary();
        // assert
        assertTrue(summary.contains("3.00"));
    }
}