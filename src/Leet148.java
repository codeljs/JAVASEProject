public class Leet148 {

    //sort the section between head and tail(not include tail)
    public ListNode sortList(ListNode head) {
        return sort(head, null);
    }

    public ListNode sort(ListNode head, ListNode tail) {
        if(head == null)return head;
        if(head.next == tail){
            head.next = null;
            return head;
        }
        //slow and fast pointer
        ListNode slow = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode mid = slow;
        ListNode head1 = sort(head, mid);
        ListNode head2 = sort(mid,tail);
        ListNode res = merge(head1,head2);
        return res;
    }

    public ListNode merge(ListNode head1, ListNode head2){
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead, temp1 = head1, temp2 = head2;
        while(head1 != null && head2 != null){
            if(head1.val> head2.val){
                temp.next = head2;
                head2 = head2.next;
            }else{
                temp.next = head1;
                head1 = head1.next;
            }
            temp = temp.next;
        }
        temp.next = (head1 != null)? head1 : head2;
        return dummyHead.next;
    }
}




