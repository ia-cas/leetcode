
// Definition for a binary tree node.
 class TreeNode {
     int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }
public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p != null && q == null) return false;
        else if (p == null && q != null) return false;
        else {
            if (p.val != q.val) return false;
            else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
    }

    public static void main(String args[]){
        TreeNode root_p = new TreeNode(0);
//        root_p.left  = new TreeNode(7);
//        root_p.right = new TreeNode(6);
//        root_p.left.left = new TreeNode(8);
//        root_p.left.right = new TreeNode(0);

        TreeNode root_q = new TreeNode(8);
//        root_q.left  = new TreeNode(7);
//        root_q.right = new TreeNode(6);
//        root_q.left.left = new TreeNode(8);
//        root_q.left.right = new TreeNode(4);

        Same_Tree st = new Same_Tree();
        System.out.print(st.isSameTree(root_p, root_q));
    }
}