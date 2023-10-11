package com.hauschildt.day6;

import com.hauschildt.day2.BankAccount;

import java.util.*;

import static com.hauschildt.day6.MyCollections.printCollection;

public class MoreCollections {
    private static List<BankAccount> myList3;
    private static List<BankAccount> myList4;
    private static List<BankAccount> myList5;
    public static void main(String[] args) {
        myList3 = Arrays.asList(new BankAccount(100)); // returns a List, not an ArrayList
        myList3 = new ArrayList<>(Arrays.asList(new BankAccount(100)));
        myList3.add(new BankAccount(200));

        // Shallow copy
        myList4 = new ArrayList<>(myList3);
        myList4.get(0).setBalance(101);
        printCollection(myList3, "vertical");
        printCollection(myList4, "vertical");
        
        // Deep copy
        myList5 = new ArrayList<>(myList3.size());
        Iterator<BankAccount> iterator = myList3.iterator();
        while(iterator.hasNext()) {
            myList5.add(iterator.next().clone());
        }
        myList5.get(0).setBalance(102);
        printCollection(myList3, "vertical");
        printCollection(myList5, "vertical");
    }
}
