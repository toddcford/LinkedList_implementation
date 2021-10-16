package com.toddford;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));
        System.out.println(list.contains(30));
        list.deleteLast();
        System.out.println("deleted last");
        list.deleteLast();
        System.out.println("deleted last");
        list.deleteLast();
        System.out.println("deleted last");
        list.addFirst(30);
        System.out.println(list.contains(30));
    }
}
