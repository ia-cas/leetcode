package Week4_Tree;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Stack;

/**
 * Author: thunderlbc
 * Date:   15-5-20
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_8_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root){
        int dep = 0;

        if(root == null)
            return dep;

        Stack<TreeNode> st = new Stack<TreeNode>();
        HashSet<TreeNode> hs = new HashSet<TreeNode>();

        st.push(root);

        int cur_dep = 1;

        while(!st.empty()){
            TreeNode tmp = st.pop();

            while(tmp.left != null){
                if(hs.contains(tmp.left))
                    break;
                cur_dep ++;
                st.push(tmp);
                tmp = tmp.left;
            }
            if(tmp.right == null){
                if(tmp.left == null){
                    hs.add(tmp);
                    dep = cur_dep > dep ? cur_dep:dep;
                    cur_dep --;
                }
                if(hs.contains(tmp.left)) {
                    hs.add(tmp);
                    cur_dep--;
                }
            }else if (!hs.contains(tmp.right)){
                st.push(tmp);
                st.push(tmp.right);
                cur_dep ++;
            }else{
                hs.add(tmp);
                cur_dep --;
            }
        }
        return dep;
    }


    public static void main(String[]args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(4);

        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
//        t3.left = t4;
//        t3.right = t1;
//        t4.left = t5;
//        t5.right = t7;
//        t7.left = t2;
//        t2.left = t6;

//        t1.left = t2;
//        t2.right = t3;
//        t2.left = t6;
//        t1.right = t4;
//        t4.left= t5;
//        t4.right = t7;
//t1.left = t2;
        t1.right = t3;
        t3.left = t2;

//        t1.left = t2;
//        t2.right = t3;
        TreeNode tn = null;


        LeetCode_8_MaximumDepthOfBinaryTree lcmdbt = new LeetCode_8_MaximumDepthOfBinaryTree();

        System.out.println(lcmdbt.maxDepth(t1));
    }
}
