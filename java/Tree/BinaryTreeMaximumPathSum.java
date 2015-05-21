public class Solution {
    long max = Integer.MIN_VALUE;
    
    public long maxSum(TreeNode x){
        if(x == null){
            return Integer.MIN_VALUE;
        }
        long l = maxSum(x.left);
        long r = maxSum(x.right);
        long curMax = Math.max(Math.max(l, r), l+r+x.val);
        max = Math.max(max, curMax);
        return Math.max(x.val,Math.max(x.val+l,x.val+r));
        
    }
    
    public int maxPathSum(TreeNode root) {
        if(root == null){
            return 0;
        }
        return (int)Math.max(maxSum(root),max);
    }
}
