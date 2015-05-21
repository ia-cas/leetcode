public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> children = new LinkedList<TreeNode>();
        children.add(root.left);
        children.add(root.right);
        return isSym(children);        
    }
    
    public boolean isSym(Queue<TreeNode> s){
        while(!s.isEmpty()){
            TreeNode l = s.remove();
            TreeNode r = s.remove();
            if(l!=null && r!=null){
                if(l.val == r.val){
                    s.add(l.left);
                    s.add(r.right);
                    s.add(l.right);
                    s.add(r.left);
                }
                else{
                    return false;
                }
            }
            else if(l==null && r==null){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
