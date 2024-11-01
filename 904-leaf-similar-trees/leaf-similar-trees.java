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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer>leaves1= new ArrayList<>();
        List<Integer>leaves2= new ArrayList<>();
        AddLeaves(root1,leaves1);
        AddLeaves(root2,leaves2);
        if(leaves1.equals(leaves2)) return true;
        else return false;
    }
    public void AddLeaves(TreeNode root, List<Integer>ans){
         if(root==null) return;
         if(root.left==null && root.right==null){
            ans.add(root.val);
         }
         else{
         AddLeaves(root.left,ans);
         AddLeaves(root.right,ans);
         }
    }
}