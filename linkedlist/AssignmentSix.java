package com.assignment.linkedlist;

import java.util.LinkedList;

public class AssignmentSix {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.addFirst("Apple");        

        linkedList.addLast("Banana");

        System.out.println("Linked List after insertion: " + linkedList);
    }
}
