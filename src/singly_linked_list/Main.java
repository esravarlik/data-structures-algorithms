package singly_linked_list;

public class Main {

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFront("Omer", 1000);
        list.addFront("Oguzhan", 1500);
        list.addFront("Fatih", 1250);
        list.print();
        System.out.println();

        System.out.println("Remove front :");
        list.removeFront();
        list.print();
        System.out.println();

        System.out.println("Remove back :");
        list.removeBack();
        list.print();
        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.insertOrdered("Paul", 720);
        list2.insertOrdered("Rose", 590);
        list2.insertOrdered("Anna", 660);
        list2.insertOrdered("Mike", 1105);
        list2.insertOrdered("Rob", 750);
        list2.insertOrdered("Jack", 510);
        list2.insertOrdered("Jill", 740);
        System.out.println("List after insertions :");
        list2.print();
        System.out.println();

        list2.removeOrdered("Rob", 750);
        list2.print();
        System.out.println();

        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.insertOrdered("Rose", 590);
        list3.insertOrdered("Jack", 510);
        list3.insertOrdered("Jill", 740);
        list3.insertOrdered("Adam", 610);
        System.out.println("list3 : ");
        list3.print();
        System.out.println();

        SinglyLinkedList mergedList = list2.mergeLists(list3);

        System.out.println("Merged list :");
        mergedList.print();

    }
}
