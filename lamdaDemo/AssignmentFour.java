package com.assignment.lamdaDemo;

import java.util.ArrayList;
import java.util.List;

public class AssignmentFour {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Even numbers:");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("Odd numbers:");
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
    }
}
