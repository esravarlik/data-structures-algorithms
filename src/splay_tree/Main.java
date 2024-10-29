package splay_tree;

public class Main {
    public static void main(String[] args) {
        SplayTree splayTree = new SplayTree();

        splayTree.insert(10);
        splayTree.insert(20);
        splayTree.insert(30);
        splayTree.insert(40);
        splayTree.insert(50);

        System.out.println("In-order traversal:");
        splayTree.inorder();

        System.out.println();
        if (splayTree.search(30)) {
            System.out.println("30 found and moved to the root.");
        } else {
            System.out.println("30 not found.");
        }

        System.out.println("Updated In-order traversal:");
        splayTree.inorder();
    }
}
