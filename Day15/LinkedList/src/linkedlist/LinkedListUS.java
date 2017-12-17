package linkedlist;

import java.util.LinkedList;

public class LinkedListUS {

    //Properties
    Node head;
    int count;

    // Constructors
//    public LinkedList() {
//        head = null;
//        count = 0;
//    }
    public LinkedListUS(Node newHead) {
        head = newHead;
        count = 1;
    }
    // Methods

    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index) {
        if (index <= 0) {
            return -1;
        }
        Node current = head;
        for (int i = 1; 1 < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    //size
    public int size() {
        return count;
    }

    //isEmpty
    public boolean isEmpty() {
        return head == null;
    }

    //remove
    public void remove() {
        // remove from the back of the list
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Een");
        linkedList.add("Three");
        linkedList.add("Four");
        linkedList.add("Five");
        linkedList.addFirst("Nil");
        linkedList.add(2, "Two");
        linkedList.add(6, "Six");
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        System.out.println(linkedList.get(6));
    }

}
