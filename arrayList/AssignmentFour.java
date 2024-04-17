package com.assignment.arrayList;


import java.util.ArrayList;

public class AssignmentFour {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        
        String color = colors.get(1); //retrieve from specified index
        System.out.println("Color at index 1: " + color);
    }
}
