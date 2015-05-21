public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> result = new ArrayList<Integer>();
        if(root == null){
            return result;
        }

        while(root!=null || !s.isEmpty()){
            while(root != null){
                result.add(root.val);
                s.add(root);
                root = root.left;
            }

            if(!s.isEmpty()){
                root = s.pop().right;
            }
        }
        return result;
    }
}
