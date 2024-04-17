package com.assignment.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AssignmentEight {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

       
        Collections.sort(colors);

        System.out.println("Sorted Colors: " + colors);
    }
}
