package linkedlist;


class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val, Node prev, Node next, Node child) {
        this.val = val;
        this.prev = prev;
        this.next = next;
        this.child = child;
    }
};

public class FlattenaMultilevelDoublyLinkedList430 {
    public static Node flatten(Node head) {

        if(head == null) {
            return null;
        }

        if(head.next == null && head.child == null) {
            return head;
        }

        Node separatingNode = null;
        Node lastNode = null;

        if(head.child != null) {
            separatingNode = head.next;
            head.next = head.child;
            lastNode = flattenChild(head.child);
            lastNode.next = separatingNode;
        }

        flatten(head.next);

        return head;
    }

    public static Node flattenChild(Node head) {
        if(head.next == null && head.child == null) {
            return head;
        }

        Node separatingNode = null;

        if(head.child != null) {
            separatingNode = head.next;
            head.next = head.child;
            head.next = flattenChild(head.child);
        }

        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(1, null, null, null);
        head.next = new Node(2, head, null, null);
        head.next.next = new Node(3, head.next, null, null);
        head.next.next.child = new Node(7, null, null, null);
        head.next.next.child.next = new Node(8, head.next.next.child, null, null);
        head.next.next.child.next.child = new Node(11, null, null, null);
        head.next.next.child.next.child.next = new Node(12, head.next.next.child.next.child, null, null);
        head.next.next.next = new Node(4, head.next.next, null, null);
        head.next.next.next.next = new Node(5, head.next.next.next, null, null);
        head.next.next.next.next.next = new Node(6, head.next.next.next.next, null, null);

        flatten(head);

    }
}
