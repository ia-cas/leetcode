
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();

        if(root == null){
            return result;
        }

        while(root!=null || !s.isEmpty()){
            while(root != null){
                s.add(root);
                root = root.left;
            }

            if(!s.isEmpty()){
                root = s.pop();
                result.add(root.val);
                root = root.right;
            }
        }
        return result;
        
    }
