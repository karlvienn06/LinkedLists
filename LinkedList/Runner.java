package LinkedList;

public class Runner {

    public static void main (String args[]){


        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insertAt(1,4);
        linkedList.insertAt(0,12);
        linkedList.deleteAt(0);


        linkedList.print();



    }


}
