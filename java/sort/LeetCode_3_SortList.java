package Week3_Sort;

/**
 * Author: thunderlbc
 * Date:   15-4-14
 * Email: thunderlbc@gmail.com
 * website: www.libingchen.me
 */
public class LeetCode_3_SortList {

    public ListNode sortList(ListNode head){

        if(head == null)
            return null;
        ListNode countCur = head;
        int count = 0;
        while(countCur !=null){
            count ++;
            countCur = countCur.next;
        }

        if(count == 1){
            return head;
        }

        return sortListHelp(head, count);

    }

    public ListNode sortListHelp(ListNode head, int len){
        ListNode re = head;
        ListNode cur = head;
        int count = 0;
        int count_change = 0;
        ListNode head_bak = null;
        while(count < len - 1){
            count ++;
            head_bak = head;
            head = head.next;
            if(head.val < cur.val) {
                count_change++;
                head_bak.next = head.next;
                head.next = re;
                re = head;
                head = head_bak;
            }
        }
        if(len - count_change - 1 > 1)
            cur.next = sortListHelp(cur.next, len - count_change - 1);
        if(count_change > 1)
            re = sortListHelp(re, count_change);

        return  re;
    }


    public static void main(String[]args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(13);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode nul = null;

        LeetCode_3_SortList lcsl = new LeetCode_3_SortList();
//        ListNode re = lcsl.sortListHelp(l1,6);
        ListNode re = lcsl.sortList(l1);
        while(re != null){
            System.out.println(re.val);
            re = re.next;
        }
    }
}
