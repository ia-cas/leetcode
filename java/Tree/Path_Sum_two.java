 	public List<List<Integer>> pathSum(TreeNode root, int sum) {  
	    List<List<Integer>> res = new ArrayList<List<Integer>>();  
	    if(root==null)  
	        return res;  
	    ArrayList<Integer> item = new ArrayList<Integer>();  
	    helper(root,0,sum,item,res);  
	    return res;  
	}  
	private void helper(TreeNode root, int num, int sum, ArrayList<Integer> item, List<List<Integer>> res)  
	{  
	    num = num+root.val;
	    item.add(root.val);
	    if(root.left==null && root.right==null && sum==num)  
	    {  
	        res.add(new ArrayList<Integer>(item));  
	       // return;  
	    }  
	    if(root.left!=null)  
	    {  
	        //item.add(root.left.val);  
	        helper(root.left,num, sum,item,res);  
	        item.remove(item.size()-1);  
	    }  
	    if(root.right!=null)  
	    {  
	        //item.add(root.right.val);  
	        helper(root.right,num,sum,item,res);  
	        item.remove(item.size()-1);  
	    }          
	}