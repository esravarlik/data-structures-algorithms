package singly_linked_list;

import java.util.NoSuchElementException;

public class SinglyLinkedList {
    SinglyNode head;

    public SinglyLinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public String front() {
        if(head != null){
            return head.elem;
        }else{
            throw new NoSuchElementException("List is empty!");
        }
    }

    public void addFront(String e, int i){
        SinglyNode singlyNode = new SinglyNode(e, i);
        singlyNode.next = head;
        head = singlyNode;
    }

    public void removeFront(){
        if(isEmpty()){
            System.out.println("List is empty!");
        }

        SinglyNode temp = head;
        head = head.next;
        temp = null;
    }

    public void addBack(String e, int i){
        SinglyNode singlyNode = new SinglyNode(e, i);
        if(head == null){
            head = singlyNode;
        }else{
            SinglyNode first = head;
            while(first.next != null){
                first = first.next;
            }
            first.next = singlyNode;
        }
    }

    public void removeBack() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        SinglyNode previous = head;

        if (previous.next == null) {
            head = null;
            previous = null;
        } else {
            while (previous.next.next != null) {
                previous = previous.next;
            }

            previous.next = null;
        }
    }

    public void insertOrdered(String e, int i){
        SinglyNode newNode = new SinglyNode(e, i);

        if(head == null){
            head = newNode;
            return;
        }

        if (newNode.score < head.score) {
            newNode.next = head;
            head = newNode;
            return;
        }

        SinglyNode previous = head;
        while (previous.next != null) {
            if (newNode.score >= previous.next.score) {
                previous = previous.next;
            } else {
                break;
            }
        }

        newNode.next = previous.next;
        previous.next = newNode;
    }


    public void insertOrdered(SinglyNode newNode, SinglyNode previous) {
        if (previous.next == null || newNode.score <= previous.next.score) {
            newNode.next = previous.next;
            previous.next = newNode;
        } else {
            insertOrdered(newNode, previous.next);
        }
    }

    public void removeOrdered(String e, int i) {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        if (head.elem.equals(e) && head.score == i) {
            SinglyNode temp = head;
            head = head.next;
            temp = null;
            return;
        }

        SinglyNode previous = head;
        while (previous.next != null) {
            if (previous.next.elem.equals(e) && previous.next.score == i) {
                SinglyNode temp = previous.next;
                previous.next = previous.next.next;
                temp = null;
                return;
            }
            previous = previous.next;
        }

        if (previous.next == null) {
            System.out.println("\n" + e + " is not found");
        }
    }

    public SinglyLinkedList mergeLists(SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();

        SinglyNode plist1 = this.head;
        SinglyNode plist2 = list2.head;

        while (plist1 != null || plist2 != null) {
            if (plist1 == null) {
                mergedList.addBack(plist2.elem, plist2.score);
                plist2 = plist2.next;
                continue;
            }

            if (plist2 == null) {
                mergedList.addBack(plist1.elem, plist1.score);
                plist1 = plist1.next;
                continue;
            }

            if (plist1.score <= plist2.score) {
                mergedList.addBack(plist1.elem, plist1.score);
                plist1 = plist1.next;
            } else {
                mergedList.addBack(plist2.elem, plist2.score);
                plist2 = plist2.next;
            }
        }

        return mergedList;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        SinglyNode first = head;
        while (first != null) {
            System.out.println(first.elem + "\t" + first.score);
            first = first.next;
        }
    }
}
