import java.util.ArrayList;
import java.util.Stack;

public class Flatten_Binary_Tree_to_Linked_List {
    public void flatten(TreeNode root) {
        if (root==null) return;
        Stack<TreeNode> st = new Stack<TreeNode>();
        ArrayList<TreeNode> re = new ArrayList<TreeNode>();
        st.push(root);

        while(st.isEmpty()!=true){
            TreeNode tmp = st.pop();
            re.add(tmp);
            if(tmp.right!=null) st.push(tmp.right);
            if(tmp.left!=null) st.push(tmp.left);
        }
        if(re.size()>1) {
            for (int i = 0; i < re.size() - 1; i++) {
                re.get(i).left = null;
                re.get(i).right = re.get(i + 1);
            }
            re.get(re.size() - 2).right = re.get(re.size() - 1);
            re.get(re.size() - 2).left = null;
        }
    }

    public static void main(String args[]){
        Flatten_Binary_Tree_to_Linked_List fbttll = new Flatten_Binary_Tree_to_Linked_List();
        Binary_Tree_Preorder_Traversal btpt = new Binary_Tree_Preorder_Traversal();
        TreeNode root = new TreeNode(0);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(5);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
//        root.right.right = new TreeNode(6);
        System.out.println(btpt.preorderTraversal(root));
        fbttll.flatten(root);
        System.out.println(btpt.preorderTraversal(root));
    }
}
