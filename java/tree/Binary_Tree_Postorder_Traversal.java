import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        HashSet<TreeNode> hs = new HashSet<TreeNode>();
        if(root==null) return re;
        st.push(root);

        while(st.isEmpty()!=true){
            TreeNode tmp = st.pop();
            if(hs.contains(tmp)){
                re.add(tmp.val);
                continue;
            }
            hs.add(tmp);
            st.push(tmp);
            if(tmp.right!=null) st.push(tmp.right);
            if(tmp.left!=null) st.push(tmp.left);
        }
        return re;
    }

    public static void main(String args[]){
        Binary_Tree_Postorder_Traversal btpt = new Binary_Tree_Postorder_Traversal();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        List<Integer> b;
        b = btpt.postorderTraversal(root);
        for(int i=0; i<b.size();i++) {
            System.out.println(b.get(i));
        }
    }
}
