package com.eric;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("Language");

        System.out.println(list);

        // Using a for loop to iterate through the list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
        // Using a for-each loop to iterate through the list
        for (String element : list) {
            System.out.println("Element: " + element);
        }
        // Using a while loop to iterate through the list
        int index = 0;
        while (index < list.size()) {
            System.out.println("Element at index " + index + ": " + list.get(index));
            index++;
        }
        // Using a do-while loop to iterate through the list
        index = 0;
        do {
            System.out.println("Element at index " + index + ": " + list.get(index));
            index++;
        } while (index < list.size());
        // Using a stream to iterate through the list
        list.stream().forEach(element -> System.out.println("Element: " + element));
        // Using a lambda expression to iterate through the list
        list.forEach(element -> System.out.println("Element: " + element));
        // Using a method reference to iterate through the list
        list.forEach(System.out::println);
        // Using a parallel stream to iterate through the list
        list.parallelStream().forEach(element -> System.out.println("Element: " + element));
        // Using a forEachOrdered to maintain order in parallel stream
        list.parallelStream().forEachOrdered(element -> System.out.println("Element: " + element));
        // Using a forEach with a custom action
        list.forEach(element -> {
            if (element.startsWith("J")) {
                System.out.println("Element starting with J: " + element);
            }
        });
        // Using a filter to iterate through the list
        list.stream()
            .filter(element -> element.startsWith("J"))
            .forEach(element -> System.out.println("Element starting with J: " + element));
        // Using a map to iterate through the list
        list.stream()
            .map(String::toUpperCase)
            .forEach(element -> System.out.println("Element in uppercase: " + element));
        // Using a flatMap to iterate through the list
        list.stream()
            .flatMap(element -> element.chars().mapToObj(c -> (char) c))
            .forEach(c -> System.out.println("Character: " + c));
        // Using a reduce to iterate through the list
        String concatenated = list.stream()
            .reduce("", (a, b) -> a + b);
        System.out.println("Concatenated string: " + concatenated);
    }
}