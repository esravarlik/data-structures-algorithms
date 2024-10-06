package circularly_linked_list;

import java.util.Objects;

public class CircularlyLinkedList {

    private CircularlyNode cursor;

    public CircularlyLinkedList() {
        cursor = null;
    }

    public boolean isEmpty() {
        return cursor == null;
    }

    public String front(){
        if(isEmpty()){
            throw new IllegalStateException("List is empty. ");
        }
        return cursor.next.elem;
    }

    public String back(){
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return cursor.elem;
    }

    public void advance(){
        if(!isEmpty()){
            cursor = cursor.next;
        }
    }

    public void add(String e, int i) {
        CircularlyNode newNode = new CircularlyNode(e, i);
        if (cursor == null) {
            newNode.next = newNode;
            cursor = newNode;
        } else {
            newNode.next = cursor.next;
            cursor.next = newNode;
        }
    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }
        CircularlyNode temp = cursor.next;
        if (temp == cursor) {
            cursor = null;
        } else {
            cursor.next = temp.next;
        }
    }

    public void insertOrdered(String e, int i) {
        CircularlyNode newNode = new CircularlyNode(e, i);
        if (cursor == null) {
            newNode.next = newNode;
            cursor = newNode;
            return;
        }

        CircularlyNode front = cursor.next;
        CircularlyNode back = cursor;

        while (newNode.score > front.score) {
            back = front;
            front = front.next;

            if (back == cursor) {
                cursor.next = newNode;
                newNode.next = front;
                cursor = newNode;
                return;
            }
        }

        back.next = newNode;
        newNode.next = front;
    }

    public void removeOrdered(String e, int i) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (cursor.next == cursor) {
            if (cursor.elem.equals(e) && cursor.score == i) {
                cursor = null;
            }
            return;
        }

        CircularlyNode previous = cursor;
        CircularlyNode current = cursor.next;

        while (current != cursor) {
            if (Objects.equals(current.elem, e) && current.score == i) {
                previous.next = current.next;
                return;
            }
            previous = current;
            current = current.next;
        }

        if (Objects.equals(current.elem, e) && current.score == i) {
            previous.next = current.next;
            cursor = previous;
        } else {
            System.out.println(e + " is not found");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        CircularlyNode first = cursor.next;

        while (first != cursor) {
            System.out.println(first.elem + "\t" + first.score);
            first = first.next;
        }

        System.out.println(first.elem + "\t" + first.score);
    }
}
