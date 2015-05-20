package week4;

public class Path_Sum {
	public boolean dfs(TreeNode node, int sum, int curSum) {
        if (node == null)
           return false;
        
        if (node.left == null && node.right == null)
            return curSum + node.val == sum;
               
        return dfs(node.left, sum, curSum + node.val) || dfs(node.right, sum, curSum + node.val);
    }
    
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum, 0);
    }
}
