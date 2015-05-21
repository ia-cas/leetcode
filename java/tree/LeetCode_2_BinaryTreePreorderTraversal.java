package Week4_Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Author: thunderlbc
 * Date:   15-5-19
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_2_BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root){
        Stack<TreeNode> st_Tree = new Stack<TreeNode>();
        List<Integer> re = new ArrayList<Integer>();

        if(root == null)
            return re;

        st_Tree.push(root);


        while(!st_Tree.empty()){
            TreeNode tmp = st_Tree.pop();
            re.add(tmp.val);

            if(tmp.right != null)
                st_Tree.push(tmp.right);
            if(tmp.left != null)
                st_Tree.push(tmp.left);
        }

        return re;
    }


    public static void main(String[] args){
         TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(5);
//
//        t1.left = t2;
//        t2.right = t3;
//        t2.left = t6;
//        t1.right = t4;
//        t4.right = t5;

        t1.right = t3;
        t3.left = t2;

        TreeNode tn = null;

        LeetCode_2_BinaryTreePreorderTraversal lcbtpt = new LeetCode_2_BinaryTreePreorderTraversal();
        List<Integer> re = lcbtpt.preorderTraversal(t1);

        System.out.println(re);
    }
}
