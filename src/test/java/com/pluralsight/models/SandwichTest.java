package com.pluralsight.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {
    @Test
    public void getPrice_should_returnSevenDollars_for8InchSandwich() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, false);
        // act
        double price = sandwich.getPrice();
        // assert
        assertEquals(7.00, price);
    }
    @Test
    public void getPrice_should_addMeatPrice_toBasePrice() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, false);
        sandwich.addMeat(new Topping("ham", "meat", false));
        // act
        double price = sandwich.getPrice();
        // assert
        // base $7.00 + meat $2.00 = $9.00
        assertEquals(9.00, price);
    }
    @Test
    public void getPrice_should_addExtraMeatPrice_toBasePrice() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, false);
        sandwich.addMeat(new Topping("bacon", "meat", true));
        // act
        double price = sandwich.getPrice();
        // assert
        // base $7.00 + extra meat $1.00 = $8.00
        assertEquals(8.00, price);
    }
    @Test
    public void getPrice_should_notChange_whenAddingRegularToppings() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, false);
        double priceBeforeToppings = sandwich.getPrice();
        // act
        sandwich.addTopping(new Topping("lettuce", "regular", false));
        sandwich.addTopping(new Topping("tomatoes", "regular", false));
        sandwich.addTopping(new Topping("onions", "regular", false));
        // assert
        // price should not change after adding free toppings
        assertEquals(priceBeforeToppings, sandwich.getPrice());
    }
    @Test
    public void getSummary_should_showSizeAndBread() {
        // arrange
        Sandwich sandwich = new Sandwich("wheat", 8, false);
        // act
        String summary = sandwich.getSummary();
        // assert
        assertTrue(summary.contains("8"));
        assertTrue(summary.contains("wheat"));
    }
    @Test
    public void getSummary_should_showToasted_whenSandwichIsToasted() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, true);
        // act
        String summary = sandwich.getSummary();
        // assert
        assertTrue(summary.contains("toasted"));
    }
    @Test
    public void getSummary_should_showCorrectPrice() {
        // arrange
        Sandwich sandwich = new Sandwich("white", 8, false);
        sandwich.addMeat(new Topping("ham", "meat", false));
        // act
        String summary = sandwich.getSummary();
        // assert
        // base $7.00 + meat $2.00 = $9.00
        assertTrue(summary.contains("9.00"));
    }

}