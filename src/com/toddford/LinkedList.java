package com.toddford;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int val) {
            this.value = val;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);
        if (this.isEmpty()) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int item) {
        var node = new Node(item);
        if (this.isEmpty()) {
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int indexOf(int item) {
        int index = 0;
        var current_node = first;
        while (current_node != null) {
            if (current_node.value == item) return index;
            current_node = current_node.next;
            ++index;
        }
        return -1;
    }

    public boolean contains(int item) {
       return indexOf(item) != -1;
    }

    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
        }
        Node temp = first.next;
        first.next = null;
        first = temp;
    }

    public void deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        Node current_node = first;
        while(current_node.next != last) {
            current_node = current_node.next;
            continue;
        }

        last = current_node;
        last.next = null;
    }
}




