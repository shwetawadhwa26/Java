class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>(); 
        
        if (root == null) { 
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();  
        q.add(root);  
        
        while (!q.isEmpty()) {
            int levelSize = q.size();  
            double sum = 0; 
            
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = q.poll();  
                sum += currentNode.val;
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
            double averageLevel = sum / levelSize;
            result.add(averageLevel);  
        }
        
        return result; 
    }  
}
3