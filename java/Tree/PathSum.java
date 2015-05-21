public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        boolean result = false;
        if(root == null){
            return false;
        }
        if(root.left!=null){
            if(hasPathSum(root.left, sum-root.val)){
                return true;
            }
        }
        if(root.right!=null){
            if(hasPathSum(root.right, sum-root.val)){
                return true;
            }
        }
        if((root.left==null) && (root.right==null)){
            return sum == root.val;
        }
        return result;
    }
}
