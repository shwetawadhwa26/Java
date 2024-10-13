//BINARY SEARCH TREE

import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    public static Node insertBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data > root.data) {
            root.right = insertBST(root.right, data);
        } else {
            root.left = insertBST(root.left, data);
        }
        return root;
    }

    public static void createBST(Node root) {
        Scanner scanner = new Scanner(System.in);
        int data = scanner.nextInt();
        while (data != -1) {
            root = insertBST(root, data);
            data = scanner.nextInt();
        }
        scanner.close();
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        System.out.print(root.data + " ");
        postorder(root.right);
    }

    public static Node minValue(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public static Node maxValue(Node root) {
        if (root == null) {
            return null;
        }
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    public static void main(String[] args) {
        Node root = null;
    }
}
