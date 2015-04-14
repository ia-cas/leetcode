/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) {return l2;}
        if(l2 == null) {return l1;}
        
        ListNode result= l1.val < l2.val ? l1 : l2;
        ListNode other = l1.val < l2.val ? l2 : l1;
        
        ListNode cur = result;
        ListNode pre = result;
        
        while(other != null){
            if(cur == null){
                pre.next = other;
                break;
            }
            if(cur.val <= other.val){
                pre = cur;
                cur = cur.next;
            }
            else{
                pre.next = other;
                other = other.next;
                pre.next.next = cur;
                pre = pre.next;
            }
        }        
        return result;
    }
}
