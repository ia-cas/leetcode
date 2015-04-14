/**
 * Definition for singly-linked list.
 * class ListNode {
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
    
    public ListNode sortList(ListNode head) {
        if((head == null) || (head.next == null)) return head;
        ListNode a = head;
        ListNode cur_a = a;
        ListNode b = head.next;
        ListNode cur_b = b;
        ListNode cur = b.next;

        while(true){
            if(cur == null){ break;}
            else{
                cur_a.next = cur;
                cur_a = cur_a.next;
                cur = cur.next;
            }
            if(cur == null){ break;}
            else{
                cur_b.next = cur;
                cur_b = cur_b.next;
                cur = cur.next;
            }
        }
        cur_a.next = null;
        cur_b.next = null;

        return mergeTwoLists(sortList(a), sortList(b));
    }
}
