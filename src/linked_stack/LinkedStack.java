package linked_stack;

public class LinkedStack {

    public SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    public int n = 0;

    public int size() {
        return n;
    }

    public boolean empty(){
      return n == 0;
    }

    public int top(){
        if (empty()) {
            System.out.println("Top of empty stack!");
            return -1;
        }
        return singlyLinkedList.front();
    }

    public void push(int e){
        ++n;
        singlyLinkedList.addFront(e);
    }

    public void pop(){
        if (empty()) {
            System.out.println("Pop from empty stack!");
            return;
        }
        --n;
        singlyLinkedList.removeFront();
    }
}
