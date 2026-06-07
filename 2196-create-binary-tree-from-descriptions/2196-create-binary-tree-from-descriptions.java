/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
         Map<Integer, TreeNode> map = new HashMap<>();
        // Set to store all values that are children of any node
        Set<Integer> children = new HashSet<>();
        
        for (int[] d : descriptions) {
            int parentVal = d[0];
            int childVal = d[1];
            boolean isLeft = d[2] == 1;
            
            // Get or create the parent node
            map.putIfAbsent(parentVal, new TreeNode(parentVal));
            TreeNode parentNode = map.get(parentVal);
            
            // Get or create the child node
            map.putIfAbsent(childVal, new TreeNode(childVal));
            TreeNode childNode = map.get(childVal);
            
            // Assign the child node to the parent
            if (isLeft) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
            
            // Record this node as a child
            children.add(childVal);
        }
        
        // The root node is the only node that is not present in the children set
        for (int parentVal : map.keySet()) {
            if (!children.contains(parentVal)) {
                return map.get(parentVal);
            }
        }
        
        return null;
    }
}