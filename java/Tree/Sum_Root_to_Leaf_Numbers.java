package week4;

public class Sum_Root_to_Leaf_Numbers {
	public int result = 0;
    public int sumNumbers(TreeNode root) {
        
        if(root==null) return 0;
        
        run(root,0);
        
        return result;
        
    }
    
    public void run(TreeNode root, int num) {
        num = 10*num + root.val;
        if(root.left==null&&root.right==null) result += num;
        if(root.left!=null) run(root.left, num);
        if(root.right!=null) run(root.right, num);
    }
}
