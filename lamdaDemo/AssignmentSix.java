package com.assignment.lamdaDemo;

import java.util.ArrayList;
import java.util.List;

public class AssignmentSix {

    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>();
        doubles.add(3.5);
        doubles.add(6.2);
        doubles.add(4.8);

        double average = doubles.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.println("Average: " + average);
    }
}
