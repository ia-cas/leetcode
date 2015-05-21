package Week4_Tree;

/**
 * Author: thunderlbc
 * Date:   15-5-14
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */

import Week3_Sort.LeetCode_1_MergeSortedArray;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LeetCode_1_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q){

        if(p==null | q==null){
            return p == q;
        }

        return p.val == q.val &(isSameTree(p.left,q.left) & isSameTree(p.right,q.right));

    }


    public static void main(String[] args){
        TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(0);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(0);
        TreeNode t6 = new TreeNode(0);

        t1.left = t2;
        t3.left = t4;
        t2.right = t5;
        t4.right = t6;

        TreeNode tn = null;

        LeetCode_1_SameTree lcst = new LeetCode_1_SameTree();

        System.out.println(lcst.isSameTree(t1,t3));
    }
}
