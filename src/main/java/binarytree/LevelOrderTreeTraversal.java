package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTreeTraversal {
    Node root;


    public void traversal() {
        Queue queue = new LinkedList();
        queue.add(root);


        while (!queue.isEmpty()) {

            Node tempNode = (Node) queue.poll();

            System.out.println(tempNode.value);
            if (tempNode.leftNode != null) {
                queue.add(tempNode.leftNode);
            }


            if (tempNode.rightNode != null) {
                queue.add(tempNode.rightNode);
            }
        }
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        Node nodeLeft = new Node(2);
        Node nodeRight = new Node(3);
        Node nodeLeftLeft = new Node(4);
        Node nodeLeftRight = new Node(5);
        Node nodeRightLeft = new Node(6);
        Node nodeRightRight = new Node(7);

        LevelOrderTreeTraversal levelOrderTreeTraversal = new LevelOrderTreeTraversal();
        levelOrderTreeTraversal.root = node;
        levelOrderTreeTraversal.root.leftNode = nodeLeft;
        levelOrderTreeTraversal.root.rightNode = nodeRight;
        levelOrderTreeTraversal.root.leftNode.leftNode = nodeLeftLeft;
        levelOrderTreeTraversal.root.leftNode.rightNode = nodeLeftRight;
        levelOrderTreeTraversal.root.rightNode.leftNode = nodeRightLeft;
        levelOrderTreeTraversal.root.rightNode.rightNode = nodeRightRight;
        levelOrderTreeTraversal.traversal();
    }

}
