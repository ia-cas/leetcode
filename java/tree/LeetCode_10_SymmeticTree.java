package Week4_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Author: thunderlbc
 * Date:   15-5-20
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_10_SymmeticTree {

    public boolean isSymmetic(TreeNode root){
        //Inorder traversal  WRONG!!!!

        if(root == null){
            return true;
        }

        Stack<TreeNode> st = new Stack<TreeNode>();
        HashSet<TreeNode> hs = new HashSet<TreeNode>();


        List<Integer> ls = new ArrayList<Integer>();

        st.push(root);

        while(!st.empty()){

            TreeNode tmp = st.pop();

            while(tmp.left != null){
                if(hs.contains(tmp.left))
                    break;
                st.push(tmp);
                tmp = tmp.left;
            }

            if(!hs.contains(tmp)){
                hs.add(tmp);
                ls.add(tmp.val);
                if(tmp.right != null){
                    st.push(tmp.right);
                }
            }

        }

        int start = 0;
        int end = ls.size() - 1;

        System.out.println(ls);
        while(start < end){
            if(!ls.get(start++).equals(ls.get(end--))){
                return false;
            }
        }
        return true;
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

        LeetCode_10_SymmeticTree lcst = new LeetCode_10_SymmeticTree();

        System.out.println(lcst.isSymmetic(t1));

    }
}
