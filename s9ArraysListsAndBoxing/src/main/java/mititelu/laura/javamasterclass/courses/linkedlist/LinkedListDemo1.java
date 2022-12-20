package mititelu.laura.javamasterclass.courses.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {

    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer: " + customer.getName() + " is " + customer.getBalance());

        List<Integer> intlist = new ArrayList<>();
        intlist.add(1);
        intlist.add(3);
        intlist.add(4);

        System.out.println("first iteration");
        for(int i = 0; i < intlist.size(); i++){
            System.out.println(i + ": " + intlist.get(i));
        }

        System.out.println("after adding intlist.add(1,2)");
        intlist.add(1,2); //inserted a new element at index 1-> the others had to be shifted
        System.out.println("after adding intlist.add(1,2)");
        for(int i = 0; i < intlist.size(); i++){
            System.out.println(i + ": " + intlist.get(i));
        }


        List<Integer> intLinkedList = new LinkedList<>();
        System.out.println("intLinkedList = " + intLinkedList);

    }
}
