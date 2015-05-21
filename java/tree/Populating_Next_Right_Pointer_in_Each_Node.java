class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}

public class Populating_Next_Right_Pointer_in_Each_Node {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        TreeLinkNode tmp;
        while(root.left!=null){
            tmp = root;
            while(tmp!=null) {
                tmp.left.next = tmp.right;
                if (tmp.next != null) {
                    tmp.right.next = tmp.next.left;
                }
                tmp = tmp.next;
            }
            root=root.left;
        }
    }

    public static void main(String args[]){
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right= new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right= new TreeLinkNode(5);
        root.right.left= new TreeLinkNode(6);
        root.right.right=new TreeLinkNode(7);

        Populating_Next_Right_Pointer_in_Each_Node pnrpien = new Populating_Next_Right_Pointer_in_Each_Node();
        pnrpien.connect(root);
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
