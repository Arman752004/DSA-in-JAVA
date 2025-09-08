package linkedList.leetCode;
//https://leetcode.com/problems/reverse-linked-list/
class reversingLL {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;

        while (present != null) {
            ListNode next = present.next; // declare inside loop
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
}

