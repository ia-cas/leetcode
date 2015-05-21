public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int sum) {
        return PathFind(root, sum);
    }

    public boolean PathFind(TreeNode root, int sum){
        if(root==null) return false;
        if(root.left==null&&root.right==null){
            if(sum-root.val==0)
                return true;
        }
        return PathFind(root.left, sum-root.val)||PathFind(root.right, sum-root.val);
    }

    public static void main(String args[]){
        Path_Sum ps = new Path_Sum();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        System.out.println(ps.hasPathSum(root, 7));

    }
}
