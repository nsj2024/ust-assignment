package com.assignment.lamdaDemo;


interface IsEmpty {
    boolean check(String str);
}

public class AssignmentTwo {
    public static void main(String[] args) {
        IsEmpty isEmpty = str -> str.isEmpty();
        System.out.println("Is empty: " + isEmpty.check(""));
        System.out.println("Is empty: " + isEmpty.check("Hello"));
    }
}
