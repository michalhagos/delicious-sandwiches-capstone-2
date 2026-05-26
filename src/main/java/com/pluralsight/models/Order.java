package com.pluralsight.models;

import java.util.ArrayList;

public class Order {
    // one single list holds everything in the order
    // this is working because Sandwich, Drink and Chips all implement Priceable
    private ArrayList<Priceable> orderItems;
    // a constructor that initializes the empty order items list
    public Order() {
        this.orderItems = new ArrayList<>();
    }
    // adds a sandwich to the order
    public void addSandwich(Sandwich sandwich) {
        orderItems.add(sandwich);
    }
    // adds a drink to the order
    public void addDrink(Drink drink) {
        orderItems.add(drink);
    }
    // adds chips to the order
    public void addChips(Chips chips) {
        orderItems.add(chips);
    }
    // returns the full list of all items in the order
    public ArrayList<Priceable> getOrderItems() {
        return orderItems;
    }
    // this getTotal method calculates and returns the total price of everything in the order
    public double getTotal() {
        double total = 0;

        // Now one simple loop adds up everything. no need for the other three separate loops anymore
        for (Priceable item : orderItems) {
            total += item.getPrice();
        }

        return total;
    }
    // the getOrderSummary method returns a full readable summary of everything in the order
    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("***** Order Summary *****\n");
        // here one simple loop lists everything. no need for three separate loops anymore
        for (Priceable item : orderItems) {
            summary.append(item.getSummary()).append("\n");
        }
        summary.append("*************************\n");
        summary.append(String.format("Total: $%.2f", getTotal()));

        return summary.toString();
    }
}