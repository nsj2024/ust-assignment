package com.assignment.lamdaDemo;

import java.util.ArrayList;
import java.util.List;


public class AssignmentFive {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Orange");
        strings.add("Apple");
        strings.add("Banana");
        
        strings.sort((str1, str2) -> str1.compareTo(str2));

        System.out.println("Sorted strings: " + strings);
    }
}
