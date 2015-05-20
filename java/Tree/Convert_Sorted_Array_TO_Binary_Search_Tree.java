package week4;

import java.util.List;

public class Convert_Sorted_Array_TO_Binary_Search_Tree {

	public static TreeNode sortedArrayToBST(int[] nums) {

		if(nums.length==0) return null;
		
		return  builder(nums, 0, nums.length-1);
	}
	
	public static TreeNode builder(int[] nums, int l1, int r1) {
		int length = r1 - l1 + 1;
		int c = 0;
		if(length%2==0)  c = l1-1+length/2;
		else c = l1+length/2;
		TreeNode root = new TreeNode(nums[c]);
		if(c-1-l1>=0) root.left = builder(nums, l1, c-1);
		if(r1-c-1>=0) root.right = builder(nums, c+1, r1);
		
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		TreeNode root = sortedArrayToBST(nums);
		List<Integer> res = Binary_Tree_Preorder_Traversal.preorderTraversal(root);
		System.out.println(res.toString());
	}

}
