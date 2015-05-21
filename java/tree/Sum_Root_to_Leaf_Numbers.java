import java.util.List;

public class Sum_Root_to_Leaf_Numbers {
    int re;
    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        else
            re=0;
        sum(root,0);
        return re;
    }
    public void sum(TreeNode root, int tmpsum){
        if(root.left==null && root.right==null){
            re += tmpsum * 10 + root.val;
        }
        if(root.left!=null){
            sum(root.left, tmpsum * 10 + root.val);
        }
        if(root.right!=null){
            sum(root.right, tmpsum * 10 + root.val);
        }
    }

    public static void main(String args[]){
        Sum_Root_to_Leaf_Numbers srtln = new Sum_Root_to_Leaf_Numbers();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        int a = srtln.sumNumbers(root);
        System.out.println(a);

    }
}
