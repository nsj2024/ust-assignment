package com.assignment.linkedlist;

import java.util.LinkedList;

public class AssignmentFive {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        
        
        linkedList.add(1, "Orange");

        System.out.println("Linked List after insertion: " + linkedList);
    }
}
