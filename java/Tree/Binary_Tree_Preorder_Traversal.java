package week4;

import java.util.ArrayList;
import java.util.List;

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }

public class Binary_Tree_Preorder_Traversal {
	
	public static List<Integer> result = new ArrayList<Integer>();
	
	public static void preorder(TreeNode root) {
		if(root!=null) {
		    result.add(root.val);
			preorder(root.left);
			preorder(root.right);			
		}		
	}
	
	public static List<Integer> preorderTraversal(TreeNode root) {
		
		result = new ArrayList<Integer>();
		preorder(root);	
					
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
		List<Integer> res = preorderTraversal(root);
		System.out.println(res.toString());
	}

}
