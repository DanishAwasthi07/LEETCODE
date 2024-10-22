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
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();
        inorder(li,root);
        for(int i=0;i<li.size()-1;i++){
            if(li.get(i)>=li.get(i+1)) return false;
        }
        return true;
    }
     void inorder(ArrayList<Integer> li,TreeNode root){
        if(root!=null){
            inorder(li,root.left);
            li.add(root.val);
            inorder(li,root.right);
        }
    }
    }