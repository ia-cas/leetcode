public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isSame = false;

        if((p==null) && (q == null) ){
            isSame = true;
        }
        else if((p==null) || (q==null)){
            isSame = false;
        }
        else{
            if(p.val == q.val){
                boolean leftStatus =isSameTree(p.left, q.left);
                boolean rightStatus =isSameTree(p.right, q.right);
                isSame = leftStatus && rightStatus;
            }
        }
        return isSame;
    }
}
