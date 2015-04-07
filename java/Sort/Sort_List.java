 ListNode getMiddleNode(ListNode head) {
        ListNode slow = head;
        ListNode quick = head;
        while(quick.next!=null && quick.next.next!=null) {
            slow = slow.next;
            quick = quick.next.next;
        }
        return slow;
    }
    
    ListNode Merge(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode fakehead = new ListNode(0);
        ListNode p = fakehead;
        while(p1!=null && p2!=null) {
            if(p1.val<=p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
            
        }
        if(p1!=null) p.next = p1;
        if(p2!=null) p.next = p2;
        
        return fakehead.next;
    }
    
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode middle = getMiddleNode(head);
        ListNode next = middle.next;
        
        middle.next = null;
        
      return  Merge(sortList(head), sortList(next));
    }