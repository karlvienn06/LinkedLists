package CircularLinkedList;

public class Runner {

    public static void main (String args[]){
       LinkedList linkedList = new LinkedList();

       linkedList.init();
       linkedList.insert(5);


       linkedList.print();
        linkedList.insert(100);
        linkedList.print();

    }

}
