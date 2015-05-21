import java.util.ArrayList;

public class Minimum_Depth_of_Binary_Tree {
    int depth=0;
    int min=0;
    ArrayList<Integer> dpt = new ArrayList<Integer>();
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        PathFind(root);
        min=dpt.get(0);
        for(int i=1; i<dpt.size();i++){
            if(dpt.get(i)<min) min=dpt.get(i);
        }
        return min;
    }

    public ArrayList<Integer> PathFind(TreeNode root){
        depth++;
        if(root.left!=null){
            PathFind(root.left);
        }
        if(root.right!=null) {
            PathFind(root.right);
        }
        if(root.left==null&&root.right==null) dpt.add(depth);
        depth--;
        return dpt;
    }
    public static void main(String args[]) {
        Minimum_Depth_of_Binary_Tree min_dobt = new Minimum_Depth_of_Binary_Tree();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.right.right.right = new TreeNode(8);
        System.out.println(min_dobt.minDepth(root));
    }
}
