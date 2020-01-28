package binarytree;

class Node {
    int value;
    Node leftNode;
    Node rightNode;

    Node(int value) {
        this.value  = value;
    }
}

public class BinaryTree {

    private Node rootNode;
    private Node root;


    BinaryTree(Node rootNode) {
        this.rootNode = rootNode;
    }

    public static void main(String[] args) {
        Node rootNode = new Node(5);
        Node leftNode = new Node(7);
        Node rightNode = new Node(9);
        Node leftLeftNode = new Node(10);
        Node leftRightNode = new Node(12);
        BinaryTree tree = new BinaryTree(rootNode);
        rootNode.leftNode = leftNode;
        rootNode.rightNode = rightNode;
        rootNode.leftNode.leftNode = leftLeftNode;
        rootNode.leftNode.rightNode = leftRightNode;


    }
}
