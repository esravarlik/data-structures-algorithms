package circularly_linked_queue;

public class Main {

    public static void main(String[] args){
        CircularlyLinkedQueue Queue = new CircularlyLinkedQueue();

        System.out.println("Adding some elements to Circularly Linked Queue:");
        Queue.enqueue("Esra");
        Queue.enqueue("Sumus");
        Queue.enqueue("Ummus");
        Queue.enqueue("Asiye");
        Queue.print();

        System.out.println("Remove one element from Circularly Linked Queue:");
        Queue.dequeue();
        Queue.print();

        System.out.println("Add one element to Circularly Linked Queue:");
        Queue.enqueue("Esra");
        Queue.print();

        System.out.println("Remove one element from Circularly Linked Queue:");
        Queue.dequeue();
        Queue.print();

        System.out.println("Add one element to Circularly Linked Queue:");
        Queue.enqueue("Sumus");
        Queue.print();
    }
}
