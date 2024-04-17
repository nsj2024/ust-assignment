package com.assignment.arrayList;


import java.util.ArrayList;

public class AssignmentTwo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
