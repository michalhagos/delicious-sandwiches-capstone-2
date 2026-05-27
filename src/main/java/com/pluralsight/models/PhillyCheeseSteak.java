package com.pluralsight.models;

// PhillyCheeseSteak class extends Sandwich
public class PhillyCheeseSteak extends Sandwich {

    // constructor pre-loads all the Philly ingredients
    // calls the Sandwich parent constructor using super
    public PhillyCheeseSteak() {
        // 8 inch white bread toasted
        super("white", 8, true);
        // steak is a meat topping so it costs extra
        addMeat(new Topping("steak", "meat", false));
        // american cheese is a cheese topping so it costs extra
        addCheese(new Topping("american", "cheese", false));
        // peppers are a regular topping so they are free
        addTopping(new Topping("peppers", "regular", false));
        // mayo is a sauce so it is free
        addSauce(new Topping("mayo", "sauce", false));
    }
}