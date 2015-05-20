package week4;

public class Balanced_Binary_Tree {

	public static int maxlen = 0;
	
    public static boolean isBalanced(TreeNode root) {
    	if(root==null) return true;       
        return isBalanced(root.left)&&isBalanced(root.right)&&depth_error(root.left, root.right);
    }
    
    public static boolean depth_error(TreeNode p, TreeNode q) {
    	int a = maxDepth(p);
    	int b = maxDepth(q);
    	
    	boolean result = true;
    	if(Math.abs(a-b)>1) result = false;
    	return result;
    }
    
    public static int maxDepth(TreeNode root) {
        maxlen=0;
    	if(root==null) return 0;
        run(root,0);
        return maxlen;
    }
    
    public static void run(TreeNode root, int num)   {
        num++;
        if(root.left==null&&root.right==null) {
            if(maxlen<num) maxlen=num;
        }
        if(root.left!=null) run(root.left, num); 
        if(root.right!=null) run(root.right, num);
    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		//root.right.right = new TreeNode(3);
		boolean ans = isBalanced(root);
		System.out.println(ans);
	}

}
