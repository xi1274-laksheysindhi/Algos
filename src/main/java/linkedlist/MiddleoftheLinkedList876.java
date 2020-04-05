package linkedlist;

class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

}

public class MiddleoftheLinkedList876 {

    static ListNode findMiddleoftheLinkedList(ListNode head) {
        if(head == null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }

        ListNode slowPointr = head;
        ListNode fastPointr = head;

        while(fastPointr != null && fastPointr.next != null) {
            fastPointr = fastPointr.next.next;
            slowPointr = slowPointr.next;
        }



        return slowPointr;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        findMiddleoftheLinkedList(head);


    }
}
