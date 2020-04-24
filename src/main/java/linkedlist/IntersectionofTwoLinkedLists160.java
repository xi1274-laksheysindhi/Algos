package linkedlist;


import java.util.*;

public class IntersectionofTwoLinkedLists160 {

    ListNode node;

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        ListNode nodeA = null;
        ListNode nodeB = null;

        Deque<ListNode> mapA =new LinkedList<>();
        Deque<ListNode> mapB =new LinkedList<>();

        nodeA = headA;
        nodeB = headB;
        while(nodeA != null || nodeB != null) {
            if(nodeA != null) {
                mapA.add(nodeA);
            }
            if(nodeB != null) {
                mapB.add(nodeB);
            }

            nodeA = nodeA != null ? nodeA.next : null;
            nodeB = nodeB != null ? nodeB.next : null;
        }

        nodeA = mapA.removeLast();
        nodeB = mapB.removeLast();

        if(nodeA == nodeB && (mapA.size() == 0 || mapB.size() == 0)) {
            return nodeA;
        }

        while(nodeA == nodeB && mapA.size() > 0 && mapB.size() > 0) {
            nodeA = mapA.removeLast();
            nodeB = mapB.removeLast();
        }
        if(nodeA == nodeB && (mapA.size() == 0 || mapB.size() == 0)) {
            return nodeA;
        }

        return nodeA.next;

    }

    public static void main(String[] args) {
        ListNode list;
        ListNode list2;

        list = new ListNode(2);
        /*list2 = list;*/

        // creating first linked list
        list = new ListNode(4);
        list.next = new ListNode(1);
        list.next.next = new ListNode(8);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);

        // creating second linked list
        list2 = list;
        list2.next = list.next;
        list2.next.next = list.next.next;
        list2.next.next.next = list.next.next.next;
        list2.next.next.next.next = list.next.next.next.next;
        list2.next.next.next.next.next = list.next.next.next.next.next;
//        list2.next.next.next.next.next.next = new ListNode(13);
//        list2.next.next.next.next.next.next.next = new ListNode(15);
//        list2.next.next.next.next.next.next.next.next = new ListNode(17);
//        list2.next.next.next.next.next.next.next.next.next = new ListNode(19);
//        list2.next.next.next.next.next.next.next.next.next.next = new ListNode(21);




        getIntersectionNode(list, list2);

    }

}
