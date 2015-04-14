package Week3_Sort;

import java.util.List;

/**
 * Author: thunderlbc
 * Date:   15-4-9
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */

/**
 * Accepted in 15-4-14, 315ms , bad Algorithm
 */
public class LeetCode_2_MergeTwoSortedList {

    public ListNode mergeTwoSortedList(ListNode l1, ListNode l2){

        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        ListNode head = l1.val > l2.val ? l2:l1;

        ListNode l1_back = null;
        ListNode l2_back = null;
        boolean notend = true;
        while(notend){
            while(l1.val <= l2.val ){
                if (l1.next != null) {
                    l1_back = l1;
                    l1 = l1.next;
                } else {
                    l1.next = l2;
                    notend = false;
                    break;

                }
            }
            if(notend && l1_back != null){
                l1_back.next = l2;
            }
            while (l1.val > l2.val  ){
                if (l2.next != null) {
                    l2_back = l2;
                    l2 = l2.next;
                } else {
                    l2.next = l1;
                    notend = false;
                    break;
                }
            }
            if(notend && l2_back != null){
                l2_back.next = l1;
            }
        }
        if(l1.val <= l2.val){
            l1.next = l2;
        }else{
            l2.next = l1;
        }
        return head;
    }

    public static void main(String[]args){
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(11);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(10);
        l1.next = l2;
        l2.next = l3;
        ListNode l = null;
        ListNode m = null;

//        ListNode l7 = new ListNode(13);
//        ListNode l8 = new ListNode(19);
//
//        l1.next = l2;
//        l2.next = l3;
//        l3.next = l4;
//        l5.next = l6;
//        l6.next = l7;
//        l7.next = l8;
        LeetCode_2_MergeTwoSortedList lcmtsl = new LeetCode_2_MergeTwoSortedList();
        ListNode re = lcmtsl.mergeTwoSortedList(l1, l6);
        while(re!= null){
            System.out.println(re.val);
            re = re.next;
        }
    }
}
