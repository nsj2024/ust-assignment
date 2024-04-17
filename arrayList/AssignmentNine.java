package com.assignment.arrayList;

import java.util.ArrayList;

public class AssignmentNine {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Blue");

        
        ArrayList<String> colors2 = new ArrayList<>(colors1);

        System.out.println("Colors1: " + colors1);
        System.out.println("Colors2 (copied from Colors1): " + colors2);
    }
}
