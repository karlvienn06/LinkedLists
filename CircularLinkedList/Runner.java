package CircularLinkedList;

import DoublyLinkedList.Node;

import java.util.Scanner;

public class Runner {

    public static void main (String args[]){
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        DoublyLinkedList doubleLinkedList = new DoublyLinkedList();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Scanner scan = new Scanner(System.in);
        String choice;
        do {
            System.out.println("_______________________________");
            System.out.println("|                               |");
            System.out.println("|          Linked List          |");
            System.out.println("|                               |");
            System.out.println("|    A. Singly Linked List      |");
            System.out.println("|    B. Doubly Linked List      |");
            System.out.println("|    C. Circular Linked List    |");
            System.out.println("|                               |");
            System.out.println("|    D. Exit                    |");
            System.out.println("|_______________________________|");
            System.out.println("Choose a letter: ");
            choice = scan.next().toUpperCase();

            switch(choice) {
                case "A" :
                    do {
                        System.out.println("__________________________________________________");
                        System.out.println("|                                                  |");
                        System.out.println("|                Singly Linked List                |");
                        System.out.println("|                                                  |");
                        System.out.println("|    A. Insertion at the Beginning                 |");
                        System.out.println("|    B. Insertion at the Any Specified Position    |");
                        System.out.println("|    C. Insertion at the End                       |");
                        System.out.println("|    D. Deletion at the Beginning                  |");
                        System.out.println("|    E. Deletion at the Any Specified Position     |");
                        System.out.println("|    F. Deletion at the End                        |");
                        System.out.println("|                                                  |");
                        System.out.println("|    G. Exit                                       |");
                        System.out.println("|__________________________________________________|");
                        System.out.println("Choose a Letter: ");
                        choice = scan.next().toUpperCase();

                        switch(choice) {
                            case "A" : System.out.println("Enter a number (Start): ");
                                int start = scan.nextInt();
                                singlyLinkedList.insertAtStart(start);
                                singlyLinkedList.print();
                                break;
                            case "B" : System.out.println("Choose Index: ");
                                int index = scan.nextInt();
                                System.out.println("Enter a number:");
                                int input = scan.nextInt();
                                singlyLinkedList.insertAt(index, input);
                                singlyLinkedList.print();
                                break;
                            case "C" : System.out.println("Enter a number (End): ");
                                int end = scan.nextInt();
                                singlyLinkedList.insert(end);
                                singlyLinkedList.print();
                                break;
                            case "D" : System.out.println("Deleting number (Start): ");
                                singlyLinkedList.deleteAtStart();
                                singlyLinkedList.print();
                                break;
                            case "E" : System.out.println("Choose index (Delete): ");
                                int delete = scan.nextInt();
                                singlyLinkedList.deleteAt(delete);
                                singlyLinkedList.print();
                                break;
                            case "F" : System.out.println("Deleting number (End): ");
                                singlyLinkedList.delete();
                                singlyLinkedList.print();
                                break;
                            case "G" : System.out.println("Thanks for using!"); System.exit(0); break;
                            default  : System.out.println("Invalid Input"); break;

                        }
                    }
                    while(!choice.equals("G"));
                    break;
                case "B" :
                    do {
                        System.out.println("__________________________________________________");
                        System.out.println("|                                                  |");
                        System.out.println("|                Doubly Linked List                |");
                        System.out.println("|                                                  |");
                        System.out.println("|    A. Insertion at the Beginning                 |");
                        System.out.println("|    B. Insertion at the Any Specified Position    |");
                        System.out.println("|    C. Insertion at the End                       |");
                        System.out.println("|    D. Deletion at the Beginning                  |");
                        System.out.println("|    E. Deletion at the Any Specified Position     |");
                        System.out.println("|    F. Deletion at the End                        |");
                        System.out.println("|                                                  |");
                        System.out.println("|    G. Exit                                       |");
                        System.out.println("|__________________________________________________|");
                        System.out.println("Choose a Letter: ");
                        choice = scan.next().toUpperCase();

                        switch(choice) {
                            case "A" : System.out.println("Enter a number (Start): ");
                                int start = scan.nextInt();
                                doubleLinkedList.insertAtStart(start);
                                doubleLinkedList.print();
                                break;
                            case "B" : System.out.println("Choose Index: ");
                                int index = scan.nextInt();
                                System.out.println("Enter a number:");
                                int input = scan.nextInt();
                                doubleLinkedList.insertAt(index, input);
                                doubleLinkedList.print();
                                break;
                            case "C" : System.out.println("Enter a number (End): ");
                                int end = scan.nextInt();
                                doubleLinkedList.insert(end);
                                doubleLinkedList.print();
                                break;
                            case "D" : System.out.println("Deleting number (Start): ");
                                doubleLinkedList.deleteAtStart();
                                doubleLinkedList.print();
                                break;
                            case "E" : System.out.println("Choose index (Delete): ");
                                int delete = scan.nextInt();
                                doubleLinkedList.deleteAt(delete);
                                doubleLinkedList.print();
                                break;
                            case "F" : System.out.println("Deleting number (End): ");
                                doubleLinkedList.delete();
                                doubleLinkedList.print();
                                break;
                            case "G" : System.out.println("Thanks for using!"); System.exit(0); break;
                            default  : System.out.println("Invalid Input"); break;
                        }

                    }
                    while(!choice.equals("G"));
                    break;
                case "C" :
                    do {

                        System.out.println("_______________________________");
                        System.out.println("|                               |");
                        System.out.println("|     Circular Linked List      |");
                        System.out.println("|                               |");
                        System.out.println("|        A. Insertion           |");
                        System.out.println("|        B. Deletion            |");
                        System.out.println("|                               |");
                        System.out.println("|        C. Exit                |");
                        System.out.println("|_______________________________|");
                        choice = scan.next().toUpperCase();

                        switch(choice){
                            case "A": System.out.println("Insertion: ");
                                int insert = scan.nextInt();
                                circularLinkedList.insert(insert);
                                circularLinkedList.print();
                                break;
                            case "B": System.out.println("Deletion: ");
                                circularLinkedList.delete();
                                circularLinkedList.print();
                                break;
                            case "C": System.out.println("Thanks for the interest in this Linked List"); System.exit(0); break;
                            default : System.out.println("Wrong Input"); break;
                        }
                    }while(!choice.equals("C"));
                case "D" : System.out.println("Thanks for using!");System.exit(0); break;
                default  : System.out.println("Invalid Input"); break;
            }
        }
        while(!choice.contentEquals("D"));
    }
    static class CircularNode {
         int data;
         CircularNode next;
    }

    static class CircularLinkedList {

        static CircularNode head;
        int size = 0;
        // pending 4
        // 1 2 3
        public static void insert(int data) {

            CircularNode node = new CircularNode();
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
                CircularNode n = head;

                while (n.next != head) {
                    n = n.next;
                }
                n.next = node;
            }

        }

        public void delete() {
            CircularNode n = head;

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
            CircularNode n = head;
            if(head == null)
                return;
            while (n.next != head) {
                System.out.print(n.data + " ");
                n = n.next;
            }
            System.out.print(n.data);// printing last node

        }

    }


    static class DoublyNode {

         int data;
         DoublyNode next;
         DoublyNode prev;

    }
    static class DoublyLinkedList {

        static DoublyNode head;

        public static void insertAtStart(int data){
            DoublyNode node = new DoublyNode();
            node.data = data;

            if (head == null) {
                head = node;
            } else {
                DoublyNode n = head;
                n.prev = node;
                head = node;
                head.next = n;
            }
        }

        public void insertAt(int index, int data){
            DoublyNode node = new DoublyNode();
            node.data = data;
            // 5 4 2 3
            if(head==null)
                head = node;
            else if(index==0){
                insertAtStart(data);
            }
            else{
                DoublyNode n = head;
                for(int i = 0; i<index-1;i++){
                    n = n.next;
                }
                node.prev = n;
                node.next = n.next;
                n.next = node;
                n.next.next.prev = n.next;
            }
        }

        public void insert(int data){

            DoublyNode node = new DoublyNode();
            node.data = data;
            node.next = null;
            node.prev = null;

            if(head==null)
                head = node;
            else {
                DoublyNode n = head;


                while (n.next != null) {
                    n = n.next;
                }
                node.prev = n;

                n.next = node;
            }
        }

        public void deleteAtStart(){

            if(head.next==null){
                head =null;
            }
            else {
                head = head.next;
                head.prev = null;
            }
        }


        // 4 3 2
        public void delete(){
            DoublyNode n = head;

            if(n.next==null)
                deleteAtStart();

            while(n.next!=null){
                if(n.next.next==null)
                    break;
                n = n.next;
            }
            n.next = null;
        }


        //5 4 3 2 1
        public void deleteAt(int index){

            DoublyNode n = head;

            if(index ==0)
                deleteAtStart();
            else {
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
            }
            n.next = n.next.next;
            n.next.prev = n;
        }

        public void print(){

            DoublyNode n = head;

            if(n==null){
                return;
            }
            else{
                while(n.next!=null){
                    System.out.print(n.data + " ");
                    n = n.next;
                }
                System.out.println(n.data + " ");
            }
        }
    }


    static class SinglyNode {

         int data;
         SinglyNode next;
    }



    static class SinglyLinkedList {

        static SinglyNode head;

        public void insertAtStart(int data){
            SinglyNode node = new SinglyNode();
            node.data = data;

            SinglyNode n = head;
            head = node;
            head.next = n;

        }

        public void insertAt(int index, int data){
            SinglyNode node = new SinglyNode();
            node.data = data;
            // 5 4 2 3
            if(head==null)
                head = node;
            else if(index==0){
                insertAtStart(data);
            }
            else{
                SinglyNode n = head;
                for(int i = 0; i<index-1;i++){
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
        }

        public void insert(int data){

            SinglyNode node = new SinglyNode();
            node.data = data;
            node.next = null;

            if(head==null)
                head = node;
            else {
                SinglyNode n = head;

                while (n.next != null) {
                    n = n.next;
                }

                n.next = node;
            }
        }


        public void deleteAtStart(){
            if(head.next==null)
                head = null;
            else
                head = head.next;
        }


        // 4 3 2
        public void delete(){
            SinglyNode n = head;

            if(n.next==null)
                deleteAtStart();



            while(n.next!=null){
                if(n.next.next==null)
                    break;
                n = n.next;
            }
            n.next = null;
        }


        //5 4 3 2 1
        public void deleteAt(int index){

            SinglyNode n = head;

            if(index ==0)
                deleteAtStart();
            else {
                for (int i = 0; i < index - 1; i++) {
                    n = n.next;
                }
            }
            n.next = n.next.next;
        }


        public void print(){

            SinglyNode n = head;

            if(n==null)
                return;
            else {
                while (n.next != null) {
                    System.out.print(n.data + " ");
                    n = n.next;
                }
                System.out.println(n.data + " ");
            }

        }


    }

}