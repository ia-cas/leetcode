    public int maxlen = 0;
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        run(root,0);
        return maxlen;
    }
    
    public void run(TreeNode root, int num)
    {
        num++;
        if(root.left==null&&root.right==null) {
            if(maxlen<num) maxlen=num;
        }
        if(root.left!=null) run(root.left, num); 
        if(root.right!=null) run(root.right, num);
    }