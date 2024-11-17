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
    boolean ans=false;
    public void help(TreeNode root,int key){
        if(root==null) return;
        if(root.val!=key) ans=true;
        if(ans) return;
        help(root.left,key);
        help(root.right,key);
    }
    public boolean isUnivalTree(TreeNode root) {
        help(root,root.val);
        return !ans;
    }
}