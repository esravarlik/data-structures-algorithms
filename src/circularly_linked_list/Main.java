package circularly_linked_list;

public class Main {

    public static void main(String[] args){
        CircularlyLinkedList list = new CircularlyLinkedList();

        list.add("Omer", 1000);
        list.add("Oguzhan", 1500);
        list.add("Fatih", 1250);
        list.print();

        System.out.println();
        list.remove();
        list.print();

        System.out.println();
        list.remove();
        list.print();

        System.out.println();
        list.remove();
        list.print();

        CircularlyLinkedList orderedList = new CircularlyLinkedList();

        orderedList.insertOrdered("Paul", 720);
        orderedList.insertOrdered("Rose", 590);
        orderedList.insertOrdered("Anna", 660);
        orderedList.insertOrdered("Mike", 1105);
        orderedList.insertOrdered("Rob", 750);
        orderedList.insertOrdered("Jack", 510);
        orderedList.insertOrdered("Jill", 740);

        System.out.println("List after insertions:");
        orderedList.print();

        orderedList.removeOrdered("Jack", 510);
        orderedList.removeOrdered("Mike", 1105);
        orderedList.removeOrdered("Paul", 720);

        System.out.println("\nList after removals (Jack, Mike, Paul):");
        orderedList.print();

        orderedList.removeOrdered("Rose", 590);
        orderedList.removeOrdered("Rob", 750);
        orderedList.removeOrdered("Anna", 660);
        orderedList.removeOrdered("Jill", 740);

        System.out.println("\nList after removals (Rose, Rob, Anna, Jill):");
        orderedList.print();
    }
}
