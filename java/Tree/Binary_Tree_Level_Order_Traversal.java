package week4;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal {

	public static List<List<Integer>> ans;
	public static List<TreeNode> pre;
	
	public static List<List<Integer>> levelOrder(TreeNode root){
		ans = new ArrayList<List<Integer>>();
		pre = new ArrayList<TreeNode>();
		if(root!=null) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(root.val);
			ans.add(temp);
			pre.add(root);
			while(pre.size()>0) {
				temp = new ArrayList<Integer>();
				ArrayList<TreeNode> temp_pre = new ArrayList<TreeNode>();
				for(int i=0;i<pre.size();i++) {
					if(pre.get(i).left!=null) {
						temp.add(pre.get(i).left.val);
						temp_pre.add(pre.get(i).left);
					}
					if(pre.get(i).right!=null) {
						temp.add(pre.get(i).right.val);
						temp_pre.add(pre.get(i).right);
					}
				}
				pre = new ArrayList<TreeNode>(temp_pre);
				if(temp.size()>0) ans.add(temp);
			}
		}
		
		return ans;
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
		List<List<Integer>> res = levelOrder(root);
		for(int j=0;j<res.size();j++) {
			System.out.println(res.get(j).toString());
		}
	}

}
