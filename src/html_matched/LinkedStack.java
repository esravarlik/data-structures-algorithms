package html_matched;

public class LinkedStack {

    public SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
    public int n = 0;

    public int size() {
        return n;
    }

    public boolean empty(){
        return n == 0;
    }

    public String top(){
        if (empty()) {
            System.out.println("Top of empty stack!");
            throw new IllegalStateException("Top of empty stack!");
        }
        return singlyLinkedList.front();
    }

    public void push(String e){
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