package com.assignment.lamdaDemo;


import java.util.ArrayList;
import java.util.List;


public class AssignmentSeven {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);

        List<Integer> unique_nums = new ArrayList<>();
        numbers.stream().distinct().forEach(unique_nums::add);
        System.out.println("List without duplicates: " + unique_nums);
    }
}
