// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class PostOrderTraversal {

    // Function to perform postorder traversal
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Recursively traverse the left subtree
        postOrder(root.left);

        // Recursively traverse the right subtree
        postOrder(root.right);

        // Visit the root node (print its value)
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        // Example usage
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        PostOrderTraversal tree = new PostOrderTraversal();
        System.out.println("Postorder traversal of BST:");
        tree.postOrder(root); // Output will be: 3 7 5 18 15 10
    }
}
