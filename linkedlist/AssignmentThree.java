package com.assignment.linkedlist;

import java.util.LinkedList;

public class AssignmentThree {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        
        for (int i = 1; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
