package org.example;

//Main class to demonstrate the functionality of the LinkedList.
public class Main {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addToHead(1);
        ll.addToHead(2);
        ll.addToHead(3);
        ll.addToHead(4);

        ll.addToTail(6);
        ll.addToTail(7);
        ll.addToTail(8);
        ll.addToTail(9);

        ll.printAll();

        ll.deleteFromHead();
        ll.deleteFromTail();
        ll.searchAndDelete(1);

        ll.printAll();
    }
}
