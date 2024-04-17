package com.assignment.arrayList;

import java.util.ArrayList;

public class AssignmentThree {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Green");
		colors.add("Blue");
		
		colors.add(0, "Red");
		
		System.out.println("Colors: " + colors);
	    }
}
