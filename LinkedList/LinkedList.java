package LinkedList;

public class LinkedList {

    private Node head;

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;

        Node n = head;
        head = node;
        head.next = n;

    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        // 5 4 2 3
        if(head==null)
            head = node;
        else if(index==0){
            insertAtStart(data);
        }
        else{
            Node n = head;
            for(int i = 0; i<index-1;i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null)
            head = node;
        else {
            Node n = head;

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
        Node n = head;

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

            Node n = head;

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

        Node n = head;

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
