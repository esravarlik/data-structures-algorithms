package students_sitting_at_the_table;

public class JosephusProblem {
    /**
     *
     * N children are sitting in a circle. One of them counts from 1 to M and eliminates the
     * M-th friend from the game. Then, starting from the (M+1)-th child, they begin counting
     * again and eliminate the next M-th child. This process continues until only (M-1) children
     * remain in the game. The algorithm should use a linked list to determine and display the
     * children who are eliminated at each step, as well as the remaining (M-1) children's
     * numbers at the end of the game.
     *
     */

    public static Node createCircularLinkedList(int n) {
        Node head = new Node(0);
        Node current = head;

        // 0 - N-1 circularLinkedList
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(i);
            current.next = newNode;
            current = newNode;
        }
        // Connect the last element to the beginning to complete the circle
        current.next = head;
        return head;
    }

    public static void solveJosephus(int N, int M) {
        Node head = createCircularLinkedList(N);
        Node prev = null;
        Node current = head;

        while (N > M) {
            for (int i = 1; i < M; i++) {
                prev = current;
                current = current.next;
            }
            System.out.println("Child " + current.data + " has been eliminated from the game.");


            // Update the next of the previous node
            prev.next = current.next;
            current = prev.next;
            N--;
        }

        System.out.print("Remaining children in the game: ");
        Node temp = current;
        for (int i = 0; i < M; i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
