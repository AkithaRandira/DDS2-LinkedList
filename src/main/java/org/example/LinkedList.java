package org.example;

public class LinkedList {
    Node head, tail;

    //Checks if the linked list is empty.
    public boolean isEmpty() {
        return head == null;
    }

    //Adds an element to the head of the linked list.
    public void addToHead(int element) {
        if (isEmpty()) {
            head = tail = new Node(element);
        } else {
            Node temp = new Node(element);
            temp.next = head;
            head = temp;
        }
    }

    //Deletes the node from the head of the linked list.
    public void deleteFromHead() {
        int element = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        System.out.println("Deleted\t" + element);
    }

    //Adds an element to the tail of the linked list.
    public void addToTail(int element) {
        Node temp = new Node(element);
        if (isEmpty()) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
    }

    // Deletes the node from the tail of the linked list.
    public void deleteFromTail() {
        int element = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            Node temp;
            for (temp = head; temp.next != tail; temp = temp.next);
            tail = temp;
            tail.next = null;
        }
        System.out.println("Deleted\t" + element);
    }

    // Searches for a node with a specific data value and deletes it.
    public void searchAndDelete(int element) {
        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != element) {
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            if (head == tail) {
                head = tail = null;
            } else if (temp == head) {
                head = head.next;
            } else {
                prev.next = temp.next;
            }
        }

        //Prints all elements of the linked list.
        System.out.println("Deleted\t" + element);
    }

    public void printAll() {
        for (Node temp = head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
    }
}
