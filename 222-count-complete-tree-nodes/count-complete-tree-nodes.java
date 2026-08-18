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


// Brute force

// class Solution {
//     public int countNodes(TreeNode root) {
//         if(root == null){
//             return 0;
//         }

//         int leftNodes = countNodes(root.left);
//         int rightNodes = countNodes(root.right);

//         return leftNodes + rightNodes + 1;
//     } 
// } 






// Optimal Solution

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = findLeftHeight(root.left);
        int right = findRightHeight(root.right);

        if(left == right) return ((2 << left) - 1);

        return 1 + countNodes(root.left) + countNodes(root.right);
    } 

    public int findLeftHeight(TreeNode root) {
        int height = 0;

        while(root != null) {
            height++;
            root = root.left;
        }

        return height;
    }

    public int findRightHeight(TreeNode root) {
        int height = 0;

        while(root != null) {
            height++;
            root = root.right;
        }

        return height;
    }
} 