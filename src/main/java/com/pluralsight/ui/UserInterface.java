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
}
