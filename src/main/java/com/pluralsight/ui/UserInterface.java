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

}
