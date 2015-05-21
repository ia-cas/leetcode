package Week4_Tree;

/**
 * Author: thunderlbc
 * Date:   15-5-21
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_12_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root){

        if(root == null)
            return true;

        int l_dep = maxDepth(root.left);
        int r_dep = maxDepth(root.right);

        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);

        return Math.abs(l_dep - r_dep) <= 1 & l & r;
    }

    private int maxDepth(TreeNode current){
        int dep = 0;

        if(current == null)
            return dep;

        int l_d = maxDepth(current.left);
        int r_d = maxDepth(current.right);
        dep = 1 + (l_d > r_d ? l_d:r_d);

        return dep;
    }

    public static void main(String[]args){


        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(5);
//
        t1.left = t2;
        t2.right = t3;
        t2.left = t6;
//        t1.right = t4;
//        t4.left= t5;

        TreeNode tn = null;

//        t1.left = t2;
//        t1.right =t3;
//
//        t2.left = t4;
//        t3.left = t5;

        LeetCode_12_BalancedBinaryTree lcbbt = new LeetCode_12_BalancedBinaryTree();

        System.out.println(lcbbt.isBalanced(t5));

    }
}
