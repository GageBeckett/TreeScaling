package com.company;

import java.util.LinkedList;

public class TheList {
    public static void main(String args[]) {

       /* Linked List Declaration */
        LinkedList<String> linkedlist = new LinkedList();


       /*add(String Element) is used for adding
        * the elements to the linked list*/
        for(int i = 0; i < args.length; i++){
            linkedlist.addFirst(args[i]);
        }

       /*Display Linked List Content*/
        System.out.println("Linked List Content: " +linkedlist);

       /*Add First and Last Element*/
        linkedlist.addFirst("First Item");
        linkedlist.addLast("Last Item");
        System.out.println("TheList Content after addition: " +linkedlist);

       /*This is how to get and set Values*/
        Object firstvar = linkedlist.get(0);
        System.out.println("First element: " +firstvar);
        linkedlist.set(0, "Changed first item");
        Object firstvar2 = linkedlist.get(0);
        System.out.println("First element after update by set method: " +firstvar2);

       /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("TheList after deletion of first and last element: " +linkedlist);

       /* Add to a Position and remove from a position*/
        linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);
    }
}