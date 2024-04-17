package com.assignment.arrayList;

import java.util.ArrayList;

public class AssignmentFive {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Green");
		colors.add("Red");
		colors.add("Blue");

	    
	    colors.set(1, "Yellow");
	    System.out.println("Updated Colors: " + colors);
	    }
	}
