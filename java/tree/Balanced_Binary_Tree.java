import java.util.Stack;

public class Balanced_Binary_Tree {
    int depth=0;
    int max =0;
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while (st.isEmpty() != true) {
            TreeNode tmp = st.pop();
            int m = PathFind(tmp.left);
            depth=0;max=0;
            int n = PathFind(tmp.right);
            if (Math.abs(m-n) <= 1) {
                depth=0;max=0;
                if (tmp.right != null) st.push(tmp.right);
                if (tmp.left != null) st.push(tmp.left);
            } else return false;
        }
        return true;
    }

    public int PathFind(TreeNode root){
        if(root==null) return 0;
        depth++;
        if(root.left!=null){
            PathFind(root.left);
        }
        if(root.right!=null){
            PathFind(root.right);
        }
        if(depth>max) max=depth;
        depth--;
        return max;
    }

    public static void main(String args[]){
        Balanced_Binary_Tree bbt = new Balanced_Binary_Tree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(3);
        root.right.right=new TreeNode(3);
        root.left.left.left=new TreeNode(4);
//        root.left.left.right=new TreeNode(4);
        root.right.right.right= new TreeNode(4);
        System.out.println(bbt.isBalanced(root));
    }
}
