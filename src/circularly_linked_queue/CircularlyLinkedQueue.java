package circularly_linked_queue;

public class CircularlyLinkedQueue {

    CircularlyLinkedList circularlyLinkedList = new CircularlyLinkedList();
    int n = 0;

    public int size() {
        return n;
    }

    public boolean empty() {
        return n == 0;
    }

    public String front() {
        if (empty()) {
            System.out.println("front of empty queue!");
            return null;
        }
        return circularlyLinkedList.front();
    }

    public void enqueue(String e) {
        circularlyLinkedList.add(e);
        circularlyLinkedList.advance();
        n++;
    }

    public void dequeue() {
        if (empty()) {
            System.out.println("dequeuing of empty queue!");
            return;
        }
        circularlyLinkedList.remove();
        n--;
    }

    public void print() {
        circularlyLinkedList.print();
    }
}
