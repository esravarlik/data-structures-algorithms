package splay_tree;

class SplayTree {
    private Node root;

    private Node splay(Node root, int value) {
        if (root == null || root.value == value) {
            return root;
        }

        if (value < root.value) {
            if (root.left == null) {
                return root;
            }

            if (value < root.left.value) {
                root.left.left = splay(root.left.left, value);
                root = rightRotate(root);
            } else if (value > root.left.value) {
                root.left.right = splay(root.left.right, value);
                if (root.left.right != null) {
                    root.left = leftRotate(root.left);
                }
            }

            return (root.left == null) ? root : rightRotate(root);
        } else {
            if (root.right == null) {
                return root;
            }

            if (value > root.right.value) {
                root.right.right = splay(root.right.right, value);
                root = leftRotate(root);
            } else if (value < root.right.value) {
                root.right.left = splay(root.right.left, value);
                if (root.right.left != null) {
                    root.right = rightRotate(root.right);
                }
            }

            return (root.right == null) ? root : leftRotate(root);
        }
    }

    private Node rightRotate(Node root) {
        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        return newRoot;
    }

    private Node leftRotate(Node root) {
        Node newRoot = root.right;
        root.right = newRoot.left;
        newRoot.left = root;
        return newRoot;
    }

    public void insert(int value) {
        root = insertRec(root, value);
        root = splay(root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public boolean search(int value) {
        root = splay(root, value);
        return root != null && root.value == value;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }
}