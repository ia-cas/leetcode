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
public class LeetCode_7_PathSumSecond {

    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> re = new ArrayList<List<Integer>>();

        if(root == null){
            return re;
        }

        Stack<TreeNode> st = new Stack<TreeNode>();

        HashSet<TreeNode> hs = new HashSet<TreeNode>();

        st.push(root);

        int tmp_val = root.val;

        List<Integer> li_tmp = new ArrayList<Integer>();
        li_tmp.add(tmp_val);

        while(!st.empty()){

            TreeNode tmp = st.pop();

            while(tmp.left != null){
                if(hs.contains(tmp.left)){
                    break;
                }
                st.push(tmp);
                tmp = tmp.left;
                tmp_val = tmp_val + tmp.val;
                li_tmp.add(tmp.val);
            }

            if(hs.contains(tmp.right)){
                hs.add(tmp);
                tmp_val -= tmp.val;
                li_tmp.remove(li_tmp.size() - 1);

            }else{
                if(tmp.right == null){
                    //Exit Point
                    hs.add(tmp);
                    if (tmp.left == null) {
                        if(sum == tmp_val)
                            re.add(new ArrayList<Integer>(li_tmp));
//                        System.out.println(tmp_val);

                        li_tmp.remove(li_tmp.size() - 1);
                        tmp_val -= tmp.val;

                    }else if (hs.contains(tmp.left)){

                        li_tmp.remove(li_tmp.size() - 1);
                        tmp_val -= tmp.val;
                    }

                }else if(!hs.contains(tmp.right)){
                    tmp_val = tmp_val + tmp.right.val;
                    li_tmp.add(tmp.right.val);
                    st.push(tmp);
                    st.push(tmp.right);
                }
            }
        }
        return re;
    }

    public static void main(String[]args){
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(6);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(6);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(4);

        t3.left = t4;
        t3.right = t1;
        t4.left = t5;
        t5.right = t7;
        t7.left = t2;
        t2.right = t6;
//
//        t1.left = t2;
//        t2.right = t3;
//        t2.left = t6;
//        t1.right = t4;
//        t4.left= t5;
//        t4.right = t7;
//t1.left = t2;
//        t1.right = t3;
//        t3.left = t2;

//        t1.left = t2;
//        t2.right = t3;
        TreeNode tn = null;

        LeetCode_7_PathSumSecond lcpss = new LeetCode_7_PathSumSecond();

        System.out.println(lcpss.pathSum(t3, 9));
    }
}
