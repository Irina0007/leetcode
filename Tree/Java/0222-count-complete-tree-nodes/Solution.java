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
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int countleft = 0;
        int countright = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        while (left != null) {
            countleft++;
            left = left.left;
        }

        while (right != null) {
            countright++;
            right = right.left;
        }

        if (countright == countleft) {
            return (int) Math.pow(2, countleft) + countNodes(root.right);
        } else {
            return (int) Math.pow(2, countright) + countNodes(root.left);
        }
    }
}
