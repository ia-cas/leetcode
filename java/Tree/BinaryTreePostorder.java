public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Integer> result = new Stack<Integer>();

        List<Integer> r = new ArrayList<Integer>();

        if(root == null){
            return result;
        }

        while(root!=null || !s.isEmpty()){
            while(root != null){
                s.add(root);
                result.add(root.val);
                root = root.right;
            }
            if(!s.isEmpty()){
                root = s.pop().left;
            }
        }
        while(!result.isEmpty()){
            r.add(result.pop());
        }
        return r;
        
    }
}
