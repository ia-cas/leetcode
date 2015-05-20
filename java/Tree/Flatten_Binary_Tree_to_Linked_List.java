package week4;

import java.util.LinkedList;
import java.util.List;

public class Flatten_Binary_Tree_to_Linked_List {

	public static LinkedList<Integer> result;
	public static TreeNode p;
	
    public static void flatten(TreeNode root) {   	
    	result = new LinkedList<Integer>();
    	p = null;
    	if(root==null) return;  	
    	preorder(root);   	
    	if(root.left!=null) root.left=null;
    	if(result.size()>0) {  		
    		root.val = result.get(0);
        	for(int i=1;i<result.size();i++) {
        		//System.out.println(result.get(i));
        		if(root.right==null) root.right = new TreeNode(-1);
        		root.right.val = result.get(i);
        		root = root.right;
        	}       		       	  
    	}
    }
    
    public static void preorder(TreeNode root) {
		if(root!=null) {
		    result.add(root.val);
			preorder(root.left);
			preorder(root.right);			
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		//root.right = new TreeNode(5);
		root.left.right = new TreeNode(4);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(5);
		//root.right.right = new TreeNode(6);
		flatten(root);
		List<Integer> res = Binary_Tree_Preorder_Traversal.preorderTraversal(root);
		System.out.println(res.toString());
	}

}
