public class Solution {
    
    public List<String> travelTree(TreeNode root) {
        List<String> result = new ArrayList<String>();
        if(root == null) {
            return result;
        }

        if(root.left != null) {
            for (String x : travelTree(root.left)) {
                result.add(String.valueOf(root.val) + x);
            }
        }
        if(root.right != null) {
            for (String x : travelTree(root.right)) {
                result.add(String.valueOf(root.val) + x);
            }
        }
        if((root.left==null) && (root.right==null)){
            result.add(String.valueOf(root.val));
        }
        return result;
    }
    
    public int sumNumbers(TreeNode root) {
        int sum = 0;
        if(root == null){
            return sum;
        }
        for(String x : travelTree(root)){
            sum += Integer.parseInt(x);
        }
        return sum;    
    }
}
