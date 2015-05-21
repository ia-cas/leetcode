package Week4_Tree;

/**
 * Author: thunderlbc
 * Date:   15-5-21
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_11_BinaryTreeMaximumPathSum {

    int max;
    public int maxPathSum(TreeNode root){

        if(root == null)
            return 0;

        max = root.val;

        int tmp = visit(root);

        return max > tmp ? max:tmp;

    }

    private int visit(TreeNode current){

        if(current == null)
            return 0;

        int left = visit(current.left);
        int right = visit(current.right);

        left = left>0?left:0;
        right = right>0?right:0;

        max = max>(left + right + current.val)?max:(left + right + current.val);

        return left > right? left + current.val: right + current.val;

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
        t1.right = t4;
        t4.left= t5;

        TreeNode tn = null;

//        t1.left = t2;
//        t1.right =t3;
//
//        t2.left = t4;
//        t3.left = t5;

        LeetCode_11_BinaryTreeMaximumPathSum lcbtmps = new LeetCode_11_BinaryTreeMaximumPathSum();

        System.out.println(lcbtmps.maxPathSum(t1));

    }

}
