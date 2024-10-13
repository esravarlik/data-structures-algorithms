package basic.cicular_queue;

public class Main {

    public static void main(String[] args){

        CircularQueue circularQueue = new CircularQueue();

        circularQueue.deQueue();

        circularQueue.enQueue(1);
        circularQueue.enQueue(2);
        circularQueue.enQueue(3);
        circularQueue.enQueue(4);
        circularQueue.enQueue(5);

        circularQueue.enQueue(6);

        circularQueue.display();

        int elem = circularQueue.deQueue();

        if (elem != -1) {
            System.out.println("Deleted Element is " + elem);
        }
        circularQueue.display();

        circularQueue.enQueue(7);

        circularQueue.display();
    }
}
