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
    List<Integer> list=new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        Inorder(root);
        int size=list.size();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<size;i++){
            int a=list.get(i)-list.get(i-1);
            min=Math.min(a,min);
        }
        return min;       
    }
    public void Inorder(TreeNode root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);

    }
}