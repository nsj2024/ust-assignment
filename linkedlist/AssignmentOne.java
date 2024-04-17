package com.assignment.linkedlist;

import java.util.LinkedList;

public class AssignmentOne {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        

        linkedList.addLast("Orange");

        System.out.println("Linked List after appending: " + linkedList);
    }
}
