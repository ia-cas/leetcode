package week4;

/*测试用例：
 * 普通二叉树（完全二叉树，不完全二叉树）
 * 特殊二叉树（所有结点都没有右子结点的二叉树，所有结点都没有左子结点的二叉树，
 *            只有一个结点的二叉树）
 * 特殊输入测试（二叉树的根结点为null，输入的后序遍历和中序遍历不匹配）
 */

import java.util.List;

public class Construct_Binary_Tree {
	
	 public static TreeNode buildTree(int[] inorder, int[] postorder) {
	    if(inorder.length==0||postorder.length==0) return null;
	    if(inorder.length!=postorder.length) return null;
	    
	    return builder(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
	 }

	 public static TreeNode builder(int[] inorder, int l1, int r1, int[] postorder, int l2, int r2) {
		 TreeNode root = new TreeNode(postorder[r2]);
		 int c = -1;
		 for(int i=0;i<=r1;i++) {
			 if(inorder[i]==postorder[r2]) {
				 c = i; break;
			 }
		 }
		 if(c == -1) { System.out.println("invalid input!"); return null; }
		 if(c-1-l1>=0) root.left = builder(inorder, l1, c-1, postorder, l2, l2+c-1-l1);
		 if(r1-1-c>=0) root.right = builder(inorder, c+1, r1, postorder, r2-r1+c, r2-1);
		 
		 return root;
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inorder = {5,1,8,2,6,7,3,9,12,10,4,11};
		int[] postorder = {5,1,6,2,8,3,12,10,11,4,9,7};
		TreeNode root = buildTree(inorder, postorder);
		List<Integer> res = Binary_Tree_Preorder_Traversal.preorderTraversal(root);
		System.out.println(res.toString());
	}

}
