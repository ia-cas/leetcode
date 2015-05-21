import java.util.regex.Pattern;

public class Maximum_Depth_of_Binary_Tree {
    int depth=0;
    int max=0;
    public int maxDepth(TreeNode root) {
        return PathFind(root);
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
    public static void main(String args[]) {
        Maximum_Depth_of_Binary_Tree mdobt = new Maximum_Depth_of_Binary_Tree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        root.right.right=new TreeNode(8);
        root.right.right.right= new TreeNode(8);
        System.out.println(mdobt.maxDepth(root));
    }
}
