package CircularLinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node head;

    void init() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        head = node1;
    }

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        Node last = head;


        while (last.next != head) {
            last = last.next;
        }
        last.next = node;
        node.next = head;
        head = node;

    }

    public void delete() {
        Node node = head;
        while (node.next != head) {
            node = node.next;
        }
        Node last = node;
        Node first = last.next;
        last.next = first.next;
        first = first.next;
        head = first;

    }

    public void print() {
        Node node = head;
        while (node.next != head) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);// printing last node

    }





}
