import java.util.ArrayList;
import java.util.List;

public class Path_Sum_ii {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    ArrayList<Integer> pathlist = new ArrayList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        PathFind(root, sum);
        return res;
    }
    public void PathFind(TreeNode root, int sum){
        if(root==null) return;
        pathlist.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum-root.val==0){
                res.add(new ArrayList<Integer>(pathlist));
            }
        }
        if(root.left!=null){
            PathFind(root.left, sum-root.val);
        }
        if(root.right!=null){
            PathFind(root.right, sum-root.val);
        }
        pathlist.remove(pathlist.size()-1);
    }

    public static void main(String args[]){
        Path_Sum_ii ps_ii = new Path_Sum_ii();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right= new TreeNode(3);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(0);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        List<List<Integer>> re;
        re=ps_ii.pathSum(root, 13);

        for(int i=0; i<re.size();i++){
            List<List<Integer>> temp;
            temp=re.subList(i, i+1);
            for(int j=0; j<temp.size(); j++) {
                System.out.println(temp.get(j));
            }
        }
    }

}
