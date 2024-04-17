package com.assignment.lamdaDemo;

interface Sum {
    int add(int a, int b);
}

public class AssignmentOne {
	 public static void main(String[] args) {
	        Sum sum = (a, b) -> a + b;
	        System.out.println("Sum of 5 and 3: " + sum.add(5, 3));
	    }
}
