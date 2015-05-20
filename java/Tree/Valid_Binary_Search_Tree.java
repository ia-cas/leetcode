package week4;

public class Valid_Binary_Search_Tree {
	
	 public static boolean check(TreeNode node, long leftVal, long rightVal) {
         if (node == null)
             return true;
            
         return leftVal < node.val && node.val < rightVal && check(node.left, leftVal, node.val) &&
             check(node.right, node.val, rightVal);
     }
     
     public static boolean isValidBST(TreeNode root) {
         return check(root, java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE);        
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		//root.left = new TreeNode(1);
//		root.right = new TreeNode(30);
////		root.left.right = new TreeNode(2);
////		root.left.left = new TreeNode(0);
//		//root.left.left.left = new TreeNode(1);
//		root.right.left = new TreeNode(10);
//		root.right.left.right = new TreeNode(20);
//		root.right.left.right.right = new TreeNode(40);
		System.out.println(isValidBST(root));
	}

}
