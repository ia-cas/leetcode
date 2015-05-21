public class Solution {
    
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return results;
        }
        pathSumEx(root, sum, new ArrayList<Integer>());
        return results;
    }
    
    
    public void pathSumEx(TreeNode root, int sum,List<Integer> prePath) {
        List<Integer> p_copy1 = new ArrayList<Integer>(prePath);
        List<Integer> p_copy2 = new ArrayList<Integer>(prePath);
        
        p_copy1.add(root.val);
        p_copy2.add(root.val);

        if((root.left==null) && (root.right==null)){
            if(root.val == sum){
                prePath.add(root.val);
                results.add(prePath);
            }
        }
        if(root.left != null){
            pathSumEx(root.left, sum - root.val,p_copy1);
        }
        if(root.right != null){
            pathSumEx(root.right, sum-root.val,p_copy2);
        }

    }
}
