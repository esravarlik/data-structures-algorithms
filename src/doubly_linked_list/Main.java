package doubly_linked_list;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();
        list.addFront("Omer", 1000);
        list.addFront("Oguzhan", 1500);
        list.addFront("Fatih", 1250);
        list.printH2T();

        System.out.println();
        list.removeFront();
        list.printH2T();

        System.out.println();
        list.removeFront();
        list.printH2T();

        System.out.println();
        list.removeFront();
        list.printH2T();
    }
}