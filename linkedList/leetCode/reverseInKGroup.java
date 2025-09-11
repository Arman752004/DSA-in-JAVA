package linkedList.leetCode;
//https://leetcode.com/problems/reverse-nodes-in-k-group/description/
//its also reversing the < k end items -> modify it accordingly

public class reverseInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 ||  head == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;

        while (true){
            ListNode last = prev;
            ListNode newEnd = current;

            //reverse between left and right
            ListNode check = current;
            for (int i = 0; i < k; i++) {
                if (check == null) {
                    return head; // not enough nodes left, return as-is
                }
                check = check.next;
            }
            ListNode next = current.next;
            for (int i = 0;current != null && i < k ; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                head = prev;
            }
            newEnd.next = current;

            if(current == null){
                break;
            }
            prev = newEnd;
        }
        return head;
    }
}
