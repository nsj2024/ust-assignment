package com.assignment.arrayList;

import java.util.ArrayList;

public class AssignmentSix {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

       
        colors.remove(2);

        System.out.println("Colors after removing third element: " + colors);
    }
}
