package CircularLinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node head;
    int size = 0;
    // pending 4
    // 1 2 3
    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = head;

        if(head==null) {
            head = node;
            node.next = head;
        }
        else if (head.next == head){
            head.next = node;
        }
        else {
            Node n = head;

            while (n.next != head) {
                n = n.next;
            }
            n.next = node;
        }

    }

    public void delete() {
//1 2 3 4
        Node n = head;

        if(n.next == n){
            head = null;
            return;
        }
        while(n.next.next!=head){
            n = n.next;
        }
        n.next = head;

    }

    public void print() {
        Node n = head;
        if(head == null)
            return;
        while (n.next != head) {
            System.out.print(n.data + " ");
            n = n.next;
        }
       System.out.print(n.data);// printing last node

    }





}
