package com.pluralsight.ui;
import com.pluralsight.models.Chips;
import com.pluralsight.models.Drink;
import com.pluralsight.models.Order;
import com.pluralsight.models.Sandwich;
import com.pluralsight.models.Topping;
import com.pluralsight.util.ReceiptWriter;
import java.util.Scanner;

public class UserInterface {
    // scanner reads all user input throughout the entire app
    private Scanner scanner;

    // constructor creates the scanner when UserInterface is created
    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }
    // starts the application and runs the home screen loop
// keeps running until the user chooses to exit
    public void display() {
        boolean running = true;

        while (running) {
            // show the home screen menu
            System.out.println("\n===================================");
            System.out.println("   Welcome to DELICIOUS-SANDWICHES!");
            System.out.println("==================================== ");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    // start a brand-new order
                    processNewOrder();
                    break;
                case "0":
                    // exit the application
                    running = false;
                    System.out.println("\nThank you for visiting DELICIOUS-SANDWICHES! Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    // the processNewOrder method creates a new order and shows the order screen
// keeps running until the user checks out or cancels
    private void processNewOrder() {
        // create a fresh empty order
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            // show the order screen menu
            System.out.println("\n===== Order Screen =====");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.print("Enter option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                   // processAddSandwich(order);
                    break;
                case "2":
                  //  processAddDrink(order);
                    break;
                case "3":
                   // processAddChips(order);
                    break;
                case "4":
                    // go to check out and stop the loop if confirmed
                  //  ordering = !processCheckout(order);
                    break;
                case "0":
                    // cancel the order and go back to home screen
                    ordering = false;
                    System.out.println("Order cancelled. Going back to home screen.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
