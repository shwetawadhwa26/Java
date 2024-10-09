
class Solution {
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int diff = Math.abs(leftHeight - rightHeight);

        boolean currentNodeBalanced = diff <= 1;

        boolean leftSubtreeBalanced = isBalanced(root.left);
        boolean rightSubtreeBalanced = isBalanced(root.right);
        return currentNodeBalanced && leftSubtreeBalanced && rightSubtreeBalanced;
    }
}
