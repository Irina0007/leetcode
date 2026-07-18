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
    int postidx=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postidx=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(postorder,0, postidx);
        
    }
    public TreeNode build(int[] postorder, int l, int r){
        if(l>r){
            return null;
        }
        int root_value=postorder[postidx];
        TreeNode root=new TreeNode(root_value);
        postidx=postidx-1;
        int mid=map.get(root_value);
        root.right=build(postorder,mid+1,r);
        root.left=build(postorder,l,mid-1);
        return root;
    }
}