public class Populating_Next_Right_Pointer_in_Each_Node_ii {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        TreeLinkNode rootNext = root.next;
        TreeLinkNode next = null;
        while(rootNext!=null && next==null){
            if(rootNext.left!=null){
                next = rootNext.left;
            }
            else next=rootNext.right;
            rootNext=rootNext.next;
        }
        if(root.left!=null) {
            if (root.right != null) {
                root.left.next = root.right;
            } else {
                root.left.next = next;
            }
        }
        if(root.right!=null){
            root.right.next = next;
        }
        connect(root.left);
        connect(root.right);

    }

    public static void main(String args[]){
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right= new TreeLinkNode(2);
        root.left.left = new TreeLinkNode(3);
        root.left.right= new TreeLinkNode(3);
        root.right.left= new TreeLinkNode(3);
        root.right.right=new TreeLinkNode(3);
        root.left.left.left=new TreeLinkNode(4);
        root.left.left.right=new TreeLinkNode(4);
        root.left.right.left=new TreeLinkNode(4);
        root.left.right.right=new TreeLinkNode(4);
        root.right.left.left=new TreeLinkNode(4);
        root.right.left.right=new TreeLinkNode(4);
        root.left.left.left.left=new TreeLinkNode(5);
        root.left.left.left.right=new TreeLinkNode(5);

        Populating_Next_Right_Pointer_in_Each_Node_ii pnrpien_ii = new Populating_Next_Right_Pointer_in_Each_Node_ii();
        pnrpien_ii.connect(root);
        while(root!=null){
            TreeLinkNode temp = root;
            while(temp.next!=null){
                System.out.print(temp.val);
                temp=temp.next;
            }
            System.out.println();
            root=root.left;
        }
    }
}
