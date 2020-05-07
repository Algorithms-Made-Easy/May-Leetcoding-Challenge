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
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair pair1=cousinHelper(root,x,0,root);
        Pair pair2=cousinHelper(root,y,0,root);
        return pair1.depth==pair2.depth && pair1.parent!=pair2.parent
    }
    
    public Pair cousinHelper(TreeNode node, int val,int level, TreeNode parent){
        if(node==null){  return null; } 
        if(node.val==val){  return new Pair(parent,level); }
        Pair leftpair=cousinHelper(node.left,val,level+1,node); 
        if(leftpair!=null) return leftpair;
        return cousinHelper(node.right,val,level+1,node);
    }
}

class Pair{
    TreeNode parent;
    int depth;
    
    Pair(TreeNode parent, int depth){
        this.parent=parent;
        this.depth=depth;
    }
}