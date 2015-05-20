package week4;


public class Symmetric_Tree {
	
	public static boolean isSameTree(TreeNode p, TreeNode q) {
	   if(p==null&&q==null) return true;
	   else
	   if(p==null||q==null) return false;
	   else
	   if(p.val!=q.val) return false;
	   
	   return isSameTree(p.left,q.right)&&isSameTree(p.right,q.left);
	}
	
	public static boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		else
		if(root.left==null&&root.right==null) return true;
		else
		if(root.left==null||root.right==null) return false;
		else
		if(root.left.val!=root.right.val) return false;
			
		return isSameTree(root.left,root.right);
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(4);
		boolean ans = isSymmetric(root);
		System.out.println(ans);
	}
}
