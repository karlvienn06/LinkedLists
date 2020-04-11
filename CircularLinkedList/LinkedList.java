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

        boolean firstTime = true;

        if(head==null)
            head = node;
        else if (head.next == null){
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
        while(n.next.next!=head){
            n = n.next;
        }
        n.next = head;

    }

    public void print() {
        Node n = head;
        while (n.next != head) {
            System.out.print(n.data + " ");
            n = n.next;
        }
       System.out.print(n.data);// printing last node
        System.out.println();
        System.out.println(n.next.next.next.next.data);

    }





}
