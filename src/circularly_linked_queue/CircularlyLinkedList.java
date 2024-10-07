package circularly_linked_queue;

import java.util.NoSuchElementException;

public class CircularlyLinkedList {

    CircularlyNode cursor;

    public CircularlyLinkedList(){
        cursor = null;
    }

    public boolean empty(){
        return cursor == null;
    }

    public String front(){
        if(empty()) throw new NoSuchElementException("List is empty!");
        return cursor.next.elem;
    }

    public String back(){
        if(empty()) throw new NoSuchElementException("List is empty!");
        return cursor.elem;
    }

    public void advance(){
        if(!empty()){
            cursor = cursor.next;
        }
    }

    public void add(String e) {
        CircularlyNode circularlyNode = new CircularlyNode(e);
        if (cursor == null) {
            circularlyNode.next = circularlyNode;
            cursor = circularlyNode;
        } else {
            circularlyNode.next = cursor.next;
            cursor.next = circularlyNode;
        }
    }

    public void remove() {
        if (empty()) {
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

    public void print() {
        if (empty()) {
            System.out.println("List is empty!");
            return;
        }
        CircularlyNode first = cursor.next;
        while (first != cursor) {
            System.out.println(first.elem);
            first = first.next;
        }
        System.out.println(cursor.elem);
    }
}
