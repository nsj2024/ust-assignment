package com.assignment.linkedlist;

import java.util.LinkedList;

public class AssignmentTwo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
       
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
