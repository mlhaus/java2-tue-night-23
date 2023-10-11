package com.hauschildt.day7;

import java.util.Map;
import java.util.TreeMap;

public class MyMap1 {
    private static Map<String, Integer> cityPopulations;
    public static void main(String[] args) {
        cityPopulations = new TreeMap<>();
        cityPopulations.put("Des Moines", 214133);
        cityPopulations.put("Cedar Rapids", 136981);
        cityPopulations.put("Davenport", 101724);
        cityPopulations.put("Sioux City", 85791);
        cityPopulations.put("Des Moines", 214134);
        cityPopulations.entrySet().forEach(System.out::println);
        System.out.println(cityPopulations.size());
        cityPopulations.remove("Sioux City");
        cityPopulations.entrySet().forEach(System.out::println);
        System.out.println(cityPopulations.containsKey("Sioux City"));
        System.out.println(cityPopulations.containsKey("Cedar Rapids"));
        System.out.println(cityPopulations.size());
    }
}
