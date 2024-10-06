package doubly_linked_list;

public class DoublyLinkedList {

    static class DoublyNode {
        String elem;
        int score;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(String elem, int score) {
            this.elem = elem;
            this.score = score;
            this.next = null;
            this.prev = null;
        }
    }

    private DoublyNode header;
    private DoublyNode trailer;

    public DoublyLinkedList() {
        header = new DoublyNode(null, 0);
        trailer = new DoublyNode(null, 0);
        header.next = trailer;
        trailer.prev = header;
    }

    public boolean isEmpty() {
        return header.next == trailer;
    }

    public String front() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return header.next.elem;
    }

    public String back() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return trailer.prev.elem;
    }

    public void addFront(String e, int i) {
        add(header.next, e, i);
    }

    public void addBack(String e, int i) {
        add(trailer, e, i);
    }

    private void add(DoublyNode node, String e, int i) {
        DoublyNode newNode = new DoublyNode(e, i);
        newNode.next = node;
        newNode.prev = node.prev;
        node.prev.next = newNode;
        node.prev = newNode;
    }

    public void removeFront() {
        if (isEmpty()) {
            System.out.println("List is empty !");
            return;
        }
        remove(header.next);
    }

    public void removeBack() {
        if (isEmpty()) {
            System.out.println("List is empty !");
            return;
        }
        remove(trailer.prev);
    }

    private void remove(DoublyNode node) {
        DoublyNode prevNode = node.prev;
        DoublyNode nextNode = node.next;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void printH2T() {
        if (isEmpty()) {
            System.out.println("List is empty !");
            return;
        }

        DoublyNode current = header.next;
        while (current != trailer) {
            System.out.println(current.elem + "\t" + current.score);
            current = current.next;
        }
    }

    public void printT2H() {
        if (isEmpty()) {
            System.out.println("List is empty !");
            return;
        }

        DoublyNode current = trailer.prev;
        while (current != header) {
            System.out.println(current.elem + "\t" + current.score);
            current = current.prev;
        }
    }

    public void insertOrdered(String e, int i) {
        DoublyNode newNode = new DoublyNode(e, i);
        DoublyNode current = header.next;

        while (current != trailer && newNode.score >= current.score) {
            current = current.next;
        }

        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    public void insertOrdered(DoublyNode newNode, DoublyNode current) {
        if (current == trailer || newNode.score <= current.score) {
            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
        } else {
            insertOrdered(newNode, current.next);
        }
    }

    public void removeOrdered(String e, int i) {
        if (isEmpty()) {
            System.out.println("List is empty !");
            return;
        }

        DoublyNode current = header.next;
        while (current != trailer) {
            if (current.elem.equals(e) && current.score == i) {
                remove(current);
                return;
            }
            current = current.next;
        }
        System.out.println("\n" + e + " is not found");
    }

    public DoublyLinkedList mergeLists(DoublyLinkedList list2) {
        DoublyLinkedList mergedList = new DoublyLinkedList();
        DoublyNode plist1 = this.header.next;
        DoublyNode plist2 = list2.header.next;

        while (plist1 != this.trailer || plist2 != list2.trailer) {
            if (plist1 == this.trailer) {
                mergedList.addBack(plist2.elem, plist2.score);
                plist2 = plist2.next;
                continue;
            }
            if (plist2 == list2.trailer) {
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
}
