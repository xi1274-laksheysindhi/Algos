package linkedlist;

// In this we are flattening linkedlist that are towards down and right
//we will start from right hand side we will start comparing last 2 linked lists towards downwards
// like we do in merge sort and will compare till 1st linked list
class FlatteningaLinkedList {

    Node head;

    public static void main(String args[]) {
        FlatteningaLinkedList L = new FlatteningaLinkedList();

		/* Let us create the following linked list
			5 -> 10 -> 19 -> 28
			| |	 |	 |
			V V	 V	 V
			7 20 22 35
			|		 |	 |
			V		 V	 V
			8		 50 40
			|			 |
			V			 V
			30			 45
		*/

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);

        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);

        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 28);

        // flatten the list
        L.head = L.flatten(L.head);


    }

    public Node push(Node child, int value) {

        Node currentNode = new Node(value, null, child);

        return currentNode;
    }

    public Node flatten(Node head) {

        if (head == null || head.right == null) {
            return null;
        }

        Node rightNode = flatten(head.right);

        merge(head, head.right);

        return head;
    }

    public Node merge(Node node1, Node node2) {
        if (node1 == null) {
            return node2;
        }
        if(node2 == null) {
            return node1;
        }

        Node result;

        if (node1.value > node2.value) {
            result = node2;
            node2.right = null;
            result.down = merge(node1, node2.down);
        } else {
            result = node1;
            node1.right = null;
            result.down = merge(node2, node1.down);
        }

        return result;

    }

    class Node {
        int value;
        Node right;
        Node down;

        public Node(int value, Node right, Node down) {
            this.value = value;
            this.right = right;
            this.down = down;
        }
    }
}
