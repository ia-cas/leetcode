package week4;

import java.util.ArrayList;
import java.util.List;

class TreeLinkNode {
	int val;
	TreeLinkNode left,right,next;
	TreeLinkNode(int x) { val = x; }
}

public class Populating_Next_Right_Pointers_in_Each_Node {

	public static List<TreeLinkNode> pre;
	
	public static void connect(TreeLinkNode root) {
		pre = new ArrayList<TreeLinkNode>();
		if(root!=null) {
			pre.add(root);
			root.next = null;
			while(pre.size()>0) {
				List<TreeLinkNode> temp_pre = new ArrayList<TreeLinkNode>();
				for(int i=0;i<pre.size();i++) {
					if(pre.get(i).left!=null) temp_pre.add(pre.get(i).left);
					if(pre.get(i).right!=null) temp_pre.add(pre.get(i).right);
				}
				for(int i=0;i<temp_pre.size()-1;i++) {
					temp_pre.get(i).next = temp_pre.get(i+1);
				}
				if(temp_pre.size()>0) temp_pre.get(temp_pre.size()-1).next = null;
				pre = new ArrayList<TreeLinkNode>(temp_pre);
			}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
