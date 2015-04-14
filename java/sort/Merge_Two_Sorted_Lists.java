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
        ListNode n1 = l1;
        ListNode n2 = l2;
        ListNode mtsl;
        ListNode head = null;
        if(n1==null&&n2==null) return null;
        else if(n1==null&&n2!=null) return n2;
        else if(n1!=null&&n2==null) return n1;

        if(n1.val<=n2.val){
            head = n1;
            n1 = n1.next;
        }
        else {
            head = n2;
            n2 = n2.next;
        }
        mtsl = head;

        while(n1!=null && n2!=null){
            if(n1.val <= n2.val){
                mtsl.next = n1;
                mtsl=n1;
                n1=n1.next;
            }
            else {
                mtsl.next = n2;
                mtsl=n2;
                n2=n2.next;
            }
        }
        if(n1==null){
            mtsl.next=n2;
        }
        else {
            mtsl.next=n1;
        }
        return head;
    }
}
