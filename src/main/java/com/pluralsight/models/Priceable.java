package com.pluralsight.models;

    // any class that implements the Priceable class must have getPrice and getSummary
    // Sandwich class, Drink, and Chips all implement it
public interface Priceable {
    // every item must be able to return its price
    double getPrice();

    // every item must be able to describe itself as a string
    String getSummary();

}
