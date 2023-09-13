package com.hauschildt.day7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySets {
    private static Set<String> mySet;
    public static void main(String[] args) {
        mySet = new TreeSet<>(); // new HashSet<>(); // 
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("carrot");
        mySet.add("donut");
        mySet.add("donut"); // No duplicate values
        mySet.forEach(System.out::println); // Not ordered by index
        System.out.println();
        mySet.remove("donut");
        mySet.forEach(System.out::println); // Not ordered by index
        System.out.println();
        mySet.add("donut");
        mySet.forEach(System.out::println); // Not ordered by index
        System.out.println();
    }
}
