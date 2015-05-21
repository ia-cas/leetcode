package Week4_Tree;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Author: thunderlbc
 * Date:   15-5-21
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_13_RecoverBinarySearchTree {

    public void recoverTree(TreeNode root){

        if(root == null)
            return;
        if(root.left == null & root.right == null)
            return;
        Stack<TreeNode> st = new Stack<TreeNode>();
        HashSet<TreeNode> hs = new HashSet<TreeNode>();

        st.push(root);

        int back = 0;
        boolean flg = true;

        TreeNode wr_l = null;
        TreeNode wr_i = null;

        TreeNode tr_back = null;

        while(!st.empty()){
            TreeNode tmp = st.pop();

            while(tmp.left != null){

                if(hs.contains(tmp.left))
                    break;
                st.push(tmp);
                tmp = tmp.left;
            }

            if(flg){
                flg = false;
                back = tmp.val;
            }

            hs.add(tmp);


            if(tmp.val >= back){
                back = tmp.val;

            }else{
                back = tmp.val;
                if(wr_l == null) {
                    wr_l = tr_back;
                    wr_i = tmp;
                    System.out.println(wr_l.val);
                }else{

                    //swap wrong values
                    int val_tmp = tmp.val;
                    tmp.val = wr_l.val;
                    wr_l.val = val_tmp;
                    return;
                }
            }
            tr_back = tmp;

            if(tmp.right != null){
                st.push(tmp.right);
            }
        }
        // no
        int val_fi = wr_i.val;
        wr_i.val = wr_l.val;
        wr_l.val = val_fi;

    }

    public static void main(String[]args){

         TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(9);
//
        t1.left = t2;
        t2.right = t3;
        t2.left = t6;
        t1.right = t4;
        t4.left= t5;

//        t1.right = t3;
//        t3.left = t2;

        TreeNode tn = null;

        LeetCode_3_BinaryTreeInorderTraversal ltmp = new LeetCode_3_BinaryTreeInorderTraversal();
        LeetCode_13_RecoverBinarySearchTree lcrbst = new LeetCode_13_RecoverBinarySearchTree();

        System.out.println(ltmp.inorderTraversal(t1));
        lcrbst.recoverTree(t1);
        System.out.println(ltmp.inorderTraversal(t1));

    }
}
