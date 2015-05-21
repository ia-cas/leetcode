import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        if(root==null) return re;
        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while(st.isEmpty()!=true){
            TreeNode tmp = st.pop();
            re.add(tmp.val);
            if(tmp.right!=null) st.push(tmp.right);
            if(tmp.left!=null) st.push(tmp.left);
        }
        return re;
    }

    public static void main(String args[]){
        Binary_Tree_Preorder_Traversal btpt = new Binary_Tree_Preorder_Traversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        List<Integer> a = new ArrayList<Integer>();
        a = btpt.preorderTraversal(root);
        for(int i=0; i<a.size();i++) {
            System.out.println(a.get(i));
        }
    }
}
