public class Solution {
    int max_depth=0;
    
    
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int maxDepthLeft = 1;
        int maxDepthRight = 1;
        
        if(root.left!=null){
            maxDepthLeft = 1 + maxDepth(root.left);
        }
        if(root.right!=null){
            maxDepthRight = 1 + maxDepth(root.right);
        }
        
        return Math.max(maxDepthLeft, maxDepthRight);
        
    }
}
