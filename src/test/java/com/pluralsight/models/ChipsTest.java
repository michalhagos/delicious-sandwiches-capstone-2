package com.pluralsight.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChipsTest {
    @Test
    public void getPrice_should_alwaysReturnOneFifty() {
        // arrange
        Chips chips = new Chips("lays");
        // act
        double price = chips.getPrice();
        // assert
        assertEquals(1.50, price);
    }
    @Test
    public void getSummary_should_showChipType() {
        // arrange
        Chips chips = new Chips("doritos");
        // act
        String summary = chips.getSummary();
        // assert
        assertTrue(summary.contains("doritos"));
    }
    @Test
    public void getSummary_should_showCorrectPrice() {
        // arrange
        Chips chips = new Chips("lays");
        // act
        String summary = chips.getSummary();
        // assert
        assertTrue(summary.contains("1.50"));
    }
}