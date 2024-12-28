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
    int postptr=0,inptr=0;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       postptr=inorder.length;
       inptr=inorder.length-1;
       return build(inorder,postorder,Integer.MAX_VALUE);
    }
    public TreeNode build(int[] inOrder,int[] postOrder,int last){
      if(postptr<0||inptr<0) return null;
      if(inOrder[inptr]==last) {
        inptr-=1;
        return null;
      }
       postptr-=1;
       TreeNode root=new TreeNode(postOrder[postptr]);
       root.right=build(inOrder,postOrder,root.val);
       root.left=build(inOrder,postOrder,last);
       return root;
    }
}
