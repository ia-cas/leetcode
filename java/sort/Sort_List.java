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
    ListNode GetMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
    return slow;
    }

    public ListNode MergeTwoLists(ListNode l1, ListNode l2){
        ListNode merged = new ListNode(-1);
        ListNode tmp = merged;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                tmp.next=l1;
                l1=l1.next;
            }
            else {
                tmp.next=l2;
                l2=l2.next;
            }
            tmp=tmp.next;
        }
        tmp.next= l1!=null?l1:l2;
        return merged.next;
    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode Middle = GetMiddleNode(head);
        ListNode Next = Middle.next;
        Middle.next=null;

        ListNode p1 = sortList(head);
        ListNode p2 = sortList(Next);

        return MergeTwoLists(p1, p2);
    }
}
