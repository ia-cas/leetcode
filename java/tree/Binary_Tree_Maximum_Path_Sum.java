import java.util.ArrayList;

public class Binary_Tree_Maximum_Path_Sum {
    int max=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        else{
            MaxSum(root);
            return max;
            }
        }

    public int MaxSum(TreeNode root) {
        int tmpsum = root.val;
        int lmax = 0;
        int rmax = 0;
        if (root.left != null) {
            lmax = MaxSum(root.left);
            if (lmax > 0) tmpsum += lmax;
        }
        if(root.right!=null) {
            rmax = MaxSum(root.right);
            if (rmax > 0) tmpsum += rmax;
        }
        if(tmpsum>max) max = tmpsum;
        return Math.max(root.val, Math.max(root.val+lmax, root.val+rmax));
    }

    public static void main(String args[]){
        Binary_Tree_Maximum_Path_Sum btmps = new Binary_Tree_Maximum_Path_Sum();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.left.right = new TreeNode(2);
        root.right.left.right.left = new TreeNode(2);
        root.right.left.right.right = new TreeNode(4);

        System.out.println(btmps.maxPathSum(root));
    }
}
