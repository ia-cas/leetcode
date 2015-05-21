package Week4_Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Author: thunderlbc
 * Date:   15-5-19
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_3_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> re = new ArrayList<Integer>();

        if (root == null)
            return re;

        Stack<TreeNode> st = new Stack<TreeNode>();

        HashSet<TreeNode> hs = new HashSet<TreeNode>();
        st.push(root);

        while (!st.empty()) {
            TreeNode tmp = st.pop();

            while(tmp.left != null){
                if(hs.contains(tmp.left)){
                    break;
                }

                st.push(tmp);
                tmp = tmp.left;
            }

            if (!hs.contains(tmp)) {
                re.add(tmp.val);
                hs.add(tmp);
                if(tmp.right != null){
                    st.push(tmp.right);
                }
            }
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
        t1.left = t2;
        t2.right = t3;
        t2.left = t6;
        t1.right = t4;
        t4.left= t5;

//        t1.right = t3;
//        t3.left = t2;

        TreeNode tn = null;

        LeetCode_3_BinaryTreeInorderTraversal lcbtit = new LeetCode_3_BinaryTreeInorderTraversal();
        System.out.println(lcbtit.inorderTraversal(tn));
    }
}
