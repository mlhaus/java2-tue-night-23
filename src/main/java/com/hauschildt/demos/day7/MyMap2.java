package com.hauschildt.day7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMap2 {
    private static Map<String, String> stateTrees;
    private static Map<String, Integer> treeCount;
    public static void main(String[] args) {
        stateTrees = new HashMap<>();
        stateTrees.put("Wisconsin", "Sugar Maple");
        stateTrees.put("Illinois", "White Oak");
        stateTrees.put("Vermont", "Sugar Maple");
        stateTrees.put("West Virginia", "Sugar Maple");
        stateTrees.put("Maryland", "White Oak");
        stateTrees.put("New York", "Sugar Maple");
        stateTrees.put("Connecticut", "White Oak");

        treeCount = new TreeMap<>();
        stateTrees.forEach((state, tree) -> {
            if(treeCount.containsKey(tree)) {
                treeCount.put(tree, treeCount.get(tree) + 1);
            } else {
                treeCount.put(tree, 1);
            }
        });

        printMap(treeCount);
    }

    public static void printMap(Map<?, ?> map) {
//        map.entrySet().forEach(System.out::println); // Method reference
//        map.forEach((key, value) -> System.out.println(key + " => " + value)); // Lambda Expression, allows customized output
//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " ➡\uFE0F " + entry.getValue());
//        }
        for(var key: map.keySet()) {
            System.out.println(key + " \uD83D\uDC98 " + map.get(key));
        }
    }
}
