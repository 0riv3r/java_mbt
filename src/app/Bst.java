/**
 * Binary Serach Tree class
 * @param <T>
 */
public class Bst<T extends Comparable<T>> {
    private Node root = null;
    private int nodeCount = 0;

    private class Node {
        T element;
        Node left, right;

        public Node(Node left, Node right, T element) {
            this.left = left;
            this.right = right;
            this.element = element;
        }
    }

    public boolean isEmpty() {
        return nodeCount == 0;
    }

    private Node insert(Node node, T value) {
        /** a leaf node, insert the value in this position. */
        if (node == null) {
            node = new Node(null, null, value);
        }
        /**
         * If the value is less than the current node's value, choose left.
         */
        else if (value.compareTo(node.element) < 0) {
            node.left = insert(node.left, value);
        }
        /**
         * If the value is greater than the current node's value, choose right.
         */
        else if (value.compareTo(node.element) > 0) {
            node.right = insert(node.right, value);
        }
        /** If the value already exists in the tree, return null. */
        else if (value.compareTo(node.element) == 0) {
            return null;
        }
        return node;

    }

    public void add(T value) {
        root = insert(root, value);
        nodeCount++;
    }

    public void display(Node node) {
        if (node != null) {
            /** recursively call 'display' on the left sub-tree */
            display(node.left);
            /** prints the value at the current node */
            System.out.println("The current node value is " + node.element);
            /** recursively call 'display' on the right subtree. */
            display(node.right);
        }

    }

    private boolean contains(Node node, T value) {
        /** if the value is not found */
        if (node == null)
            return false;
        /** if the value is found */
        if (value.compareTo(node.element) == 0) {
            return true;
        }
        /** Otherwise, continue the search recursively */
        return value.compareTo(node.element) < 0 ? contains(node.left, value) : contains(node.right, value);

    }

    public boolean containValue(T value) {
        return contains(root, value);
    }

    /** return the smallest value (leftmost value) */
    public T smallest(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node.element;
    }

    /** return the largest value (rightmost value) */
    public T largest(Node node) {
        while (node.right != null) {
            node = node.right;
        }
        return node.element;
    }

    public static void main(String[] args) {
        Bst<Integer> binarySearhTree = new Bst<Integer>();
        binarySearhTree.add(12);
        binarySearhTree.add(4);
        binarySearhTree.add(13);
        binarySearhTree.add(7);
        binarySearhTree.add(28);
        binarySearhTree.add(72);
        binarySearhTree.add(1);
        System.out.println("Is 12 in the tree? " + binarySearhTree.containValue(12));
        System.out.println("Is 47 in the tree? " + binarySearhTree.containValue(47));
        binarySearhTree.display(binarySearhTree.root);
        System.out.println("The smallest value in the tree is: " + binarySearhTree.smallest(binarySearhTree.root));
        System.out.println("The largest value in the tree is: " + binarySearhTree.largest(binarySearhTree.root));

    }
}