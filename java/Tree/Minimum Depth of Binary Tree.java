    public int minlen = 0;
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        run(root,0);
        return minlen;
    }
    
    public void run(TreeNode root, int num)
    {
        num++;
        if(root.left==null&&root.right==null) {
            if(minlen==0) minlen = num;
            else
            if(minlen>num) minlen=num;
        }
        if(root.left!=null) run(root.left, num); 
        if(root.right!=null) run(root.right, num);
    }