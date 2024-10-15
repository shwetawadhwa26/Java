
import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();  // To store the level-wise node values
        
        if (root == null) {  // If the tree is empty, return an empty list
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();  // Queue to help in level order traversal
        q.add(root);  // Add the root node to start traversal
        
        while (!q.isEmpty()) {
            List<Integer> level = new ArrayList<>();  // List to store nodes at the current level
            int size = q.size();  // Number of nodes at the current level
            
            for (int i = 0; i < size; i++) {
                TreeNode currentNode = q.poll();  // Remove the node from the queue
                level.add(currentNode.val);  // Add the node's value to the current level's list
                
                // Add left and right children to the queue if they exist
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            
            result.add(level);  // Add the current level's values to the result
        }
        
        return result;  // Return the level order traversal as a list of lists
    }
}
