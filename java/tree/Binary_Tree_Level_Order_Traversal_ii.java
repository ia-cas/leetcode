import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Level_Order_Traversal_ii {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> re = new ArrayList<List<Integer>>();
        if(root==null) return re;
        ArrayList<TreeNode> nodes = new ArrayList<TreeNode>();
        ArrayList<Integer> levels = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        Stack<Integer> st_levels = new Stack<Integer>();
        st.push(root);
        st_levels.push(0);

        while(st.isEmpty()!=true){
            TreeNode tmp = st.pop();
            int le = st_levels.pop();
            nodes.add(tmp);
            levels.add(le);

            if(tmp.right!=null) {
                st.push(tmp.right);
                st_levels.push(le+1);
            }
            if(tmp.left!=null) {
                st.push(tmp.left);
                st_levels.push(le+1);
            }
        }
        int max=0;
        for(int n=0; n<levels.size(); n++){
            if(max<levels.get(n)) max=levels.get(n);
        }

        for (int m=0; m<=max; m++){
            re.add(new ArrayList<Integer>());
        }

        for(int i=0; i<levels.size(); i++){
            re.get(max-levels.get(i)).add(nodes.get(i).val);
        }
        return re;
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Binary_Tree_Level_Order_Traversal_ii btlot_ii = new Binary_Tree_Level_Order_Traversal_ii();
        List<List<Integer>> ans = btlot_ii.levelOrderBottom(root);
        for (int i=0; i<ans.size(); i++){
            for (int j=0; j<ans.get(i).size(); j++)
                System.out.println(ans.get(i).get(j));
            System.out.println();
        }

    }
}
