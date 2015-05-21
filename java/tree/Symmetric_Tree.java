public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        else
            return Symmetric(root.left, root.right);
    }

    public boolean Symmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p != null && q == null) return false;
        else if (p == null && q != null) return false;
        else {
            if (p.val != q.val) return false;
            else {
                return Symmetric(p.left, q.right) && Symmetric(p.right, q.left);
            }
        }
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        Symmetric_Tree st = new Symmetric_Tree();
        System.out.println(st.isSymmetric(root));
    }
}
