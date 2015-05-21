public class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return height(root) != -1;
    }
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int maxLeft = height(root.left);
        if(maxLeft == -1){
            return -1;
        }
        int maxRight = height(root.right);
        if(maxRight == -1){
            return -1;
        }
        if(Math.abs(maxLeft - maxRight) >=2){
            return -1;
        }
        return Math.max(maxLeft, maxRight)+1;
    }
}
