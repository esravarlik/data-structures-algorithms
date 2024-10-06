package circularly_linked_list;

public class CircularlyNode {

    String elem;
    int score;
    CircularlyNode next;

    public CircularlyNode(String elem, int score) {
        this.elem = elem;
        this.score = score;
        this.next = null;
    }
}
