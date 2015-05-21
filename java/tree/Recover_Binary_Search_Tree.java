public class Recover_Binary_Search_Tree {
    TreeNode first;
    TreeNode second;
    TreeNode flag;
    public void recoverTree(TreeNode root) {
        Inorder(root);
        if(first!=null && second!=null){
            int temp = first.val;
            first.val = second.val;
            second.val = temp;
        }
    }

    public void Inorder(TreeNode root){
        if(root==null) return;
        if(root.left!=null){
            Inorder(root.left);
        }
        if(flag!=null&&flag.val>root.val){
            if(first==null) {
                first = flag;
                second = root;
            }
            else {
                second = root;
            }
        }
        flag=root;
        if(root.right!=null){
            Inorder(root.right);
        }
    }

    public static void main(String args[]){
        Recover_Binary_Search_Tree rbst = new Recover_Binary_Search_Tree();
        Binary_Tree_Inorder_Traversal btit = new Binary_Tree_Inorder_Traversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        System.out.println(btit.inorderTraversal(root));
        rbst.recoverTree(root);
        System.out.println(btit.inorderTraversal(root));
    }

}
