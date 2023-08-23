package com.hauschildt.day2;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        // Describe how you call a static method. Give an example using a method from the Helpers or UserInput class.
        // Example 1: NumberFormat.getCurrencyInstance
        // Example 2: DateTimeFormatter.ofPattern
        // Example 3: LocalDate.now()
        // Statics methods called by first typing the class name, followed by a dot, then the method name
        
        // Non-static method are called from objects, not classes. 
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate today = LocalDate.now();
        // Source: https://stackoverflow.com/questions/2379221/how-to-format-decimals-in-a-currency-format
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance();
        return "Your balance on " + today.format(formatter) + " is " + formatter2.format(balance);
    }
}
