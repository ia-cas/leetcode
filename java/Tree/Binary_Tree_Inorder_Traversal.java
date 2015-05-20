package week4;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Inorder_Traversal {
	
	public static List<Integer> result = new ArrayList<Integer>();
	
	public static void inorder(TreeNode root) {
		if(root!=null) {
			inorder(root.left);
		    result.add(root.val);			
			inorder(root.right);			
		}		
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
		
		result = new ArrayList<Integer>();
		inorder(root);	
					
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);
		root.left.left = new TreeNode(4);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		List<Integer> ans = inorderTraversal(root);
		System.out.println(ans.toString());
	}

}
