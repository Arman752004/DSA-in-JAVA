package linkedList.leetCode;


// Reversing linked list using recursion 
public class recursionReverse {
    private Node head;
    private Node tail;
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    // Recursive reverse helper
    private Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node; // new head
        }

        Node newHead = reverse(node.next); // reverse the rest
        node.next.next = node; // make next node point back
        node.next = null; // break the old link
        return newHead;
    }

    // Public function to reverse starting from head
    public void reverse() {
        head = reverse(head);

        // fix tail after reversal
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        tail = temp;
    }

    // helper to insert nodes
    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    // helper to print list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // test
    public static void main(String[] args) {
        recursionReverse list = new recursionReverse();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original:");
        list.display();

        list.reverse();

        System.out.println("Reversed:");
        list.display();
    }
}
