package linked_stack;

public class SinglyLinkedList {

    SinglyNode head;

    SinglyLinkedList(){
        head = null;
    }

    public boolean empty(){
        return head == null;
    }

    public int front(){
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        return head.elem;
    }

    public void addFront(int e){

        SinglyNode singlyNode = new SinglyNode();
        singlyNode.elem = e;
        singlyNode.next = head;
        head = singlyNode;
    }

    public void removeFront(){
        if (head == null) {
            throw new IllegalStateException("Cannot remove from an empty list");
        }

        SinglyNode temp = head;
        head = head.next;
        temp = null;
    }
}
