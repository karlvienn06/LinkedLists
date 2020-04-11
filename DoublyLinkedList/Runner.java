package DoublyLinkedList;

public class Runner {

    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();

        linkedList.insert(5);
        linkedList.insert(6);
        linkedList.insert(9);
        linkedList.insertAt(1,10);
        linkedList.insertAtStart(23);
        linkedList.deleteAtStart();
        linkedList.deleteAt(1);
        linkedList.delete();
        linkedList.print();

    }

}
