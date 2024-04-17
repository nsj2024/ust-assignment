package com.assignment.arrayList;

import java.util.ArrayList;

public class AssignmentSeven {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

     
        boolean found = colors.contains("Green");
        if (found) {
            System.out.println("Found Green in the list.");
        } else {
            System.out.println("Green not found in the list.");
        }
    }
}
