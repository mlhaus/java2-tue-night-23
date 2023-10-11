package com.hauschildt.day6;

import java.util.*;
import java.util.stream.Collectors;

public class MyCollections {
    private static List<String> myList;
    private static Set<String> mySet;
    private static Queue<String> myQueue;
    private static Map<String, Integer> myMap;

    public static void printCollection(Collection<?> collection, String direction) {
        if(direction.equalsIgnoreCase("vertical")) {
            // Advanced for loop
//            for(var el : collection) {
//                System.out.println(el);
//            }

            // Lambda Expression
//            collection.forEach((el) -> System.out.println(el));

            // Method reference
            collection.forEach(System.out::println);

            System.out.println();

        } else if (direction.equalsIgnoreCase("horizontal")) {
//            System.out.println(collection);

            // Streams and Collectors
            System.out.println(collection.stream().map(Object::toString).collect(Collectors.joining(", ")));
            
        }
    }

    public static void main(String[] args) {
        myList = new ArrayList<>();
//        myList = new LinkedList<>();
//        myList = new Stack<>();

        myList.add("cat");
        myList.add("dog");
        myList.add(1, "rabbit");
        myList.addAll(Arrays.asList("Cat", "Rabbit", "Dog"));
        myList.addAll(3, Arrays.asList("CAT", "RABBIT", "DOG"));

        printCollection(myList, "horizontal");


        mySet = new HashSet<>();
//        mySet = new LinkedHashSet<>();
//        mySet = new TreeSet<>();

        myQueue = new PriorityQueue<>();
//        myQueue = new ArrayDeque<>();

        myMap = new HashMap<>();
//        myMap = new TreeMap<>();
//        myMap = new Hashtable<>();
//        myMap = new LinkedHashMap<>();
    }
}
