/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,0,preorder.length-1);
    }
    
    public TreeNode construct(int[] pre,int start,int end){
        if(start>end) return null;
        
        TreeNode root=new TreeNode(pre[start]);
        
        int val=-1;
        for(int i=start+1;i<=end;i++){
            if(pre[i]>pre[start]){
                val=i;
                break;
            }
        }
        
        if(val==-1) 
            val=end+1;
        root.left=construct(pre,start+1,val-1);
        root.right=construct(pre,val,end);
        
        return root;
    }
}