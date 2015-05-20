package week4;

public class Same_Tree_Two {
	 public static boolean isSameTree(TreeNode p, TreeNode q) {
	   if(p==null&&q==null) return true;
	   else
	   if(p==null||q==null) return false;
	   else
	   if(p.val!=q.val) return false;
	   
	   return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
	 }
}
