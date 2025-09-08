package linkedList.leetCode;
//https://leetcode.com/problems/middle-of-the-linked-list/description/

public class middleOfLL {
    public ListNode middleNode(ListNode head){
        ListNode s = head;
        ListNode f = head;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }   
}
