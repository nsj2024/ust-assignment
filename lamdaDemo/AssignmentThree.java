package com.assignment.lamdaDemo;



import java.util.ArrayList;
import java.util.List;

public class AssignmentThree {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");

        strings.forEach(str -> {
            System.out.println("Uppercase: " + str.toUpperCase());
            System.out.println("Lowercase: " + str.toLowerCase());
        });
    }
}
