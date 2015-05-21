package Week4_Tree;

/**
 * Author: thunderlbc
 * Date:   15-5-20
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_9_MinimumDepthOfBinaryTree {


    public int minDepth(TreeNode root){

        if(root == null)
            return 0;

        int left_dep =  root.left != null? minDepth(root.left):-1;
        int right_dep =  root.right != null? minDepth(root.right):-1;

        if(left_dep != -1 & right_dep != -1){
            return left_dep >= right_dep? right_dep + 1 : left_dep +1;
        }else if (left_dep != -1){
            return left_dep + 1;
        }else if (right_dep != -1){
            return right_dep + 1;
        }else{
            return 1;
        }




    }

    public  static void main(String[]args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(4);

//        t1.left = t2;
//        t1.right = t3;
//        t3.left = t4;
//        t3.right = t5;
//        t3.left = t4;
//        t3.right = t1;
//        t4.left = t5;
//        t5.right = t7;
//        t7.left = t2;
//        t2.left = t6;

        t1.left = t2;
        t2.right = t3;
        t2.left = t6;
        t1.right = t4;
        t4.left= t5;
        t4.right = t7;
//t1.left = t2;
//        t1.right = t3;
//        t3.left = t2;

//        t1.left = t2;
//        t2.right = t3;
        TreeNode tn = null;

        LeetCode_9_MinimumDepthOfBinaryTree lcmdobt = new LeetCode_9_MinimumDepthOfBinaryTree();

        System.out.println(lcmdobt.minDepth(t1));
    }
}
