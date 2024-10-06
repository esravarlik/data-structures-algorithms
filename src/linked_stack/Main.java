package linked_stack;

public class Main {

    public static void main(String[] args){
        LinkedStack linkedStack = new LinkedStack();

        linkedStack.push(7);
        linkedStack.push(13);
        linkedStack.push(1);
        System.out.println("top: " + linkedStack.top());

        linkedStack.pop();
        linkedStack.pop();

        System.out.println("top: " + linkedStack.top());
    }
}
