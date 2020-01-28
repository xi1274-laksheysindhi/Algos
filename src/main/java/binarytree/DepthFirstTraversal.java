package binarytree;

public class DepthFirstTraversal {

    Node root;

    public static void inorderTraversal(Node node) {
        if(node == null) {
            return;
        }

        inorderTraversal(node.leftNode);

        System.out.println(node.value);
        inorderTraversal(node.rightNode);



    }

    public void preorderTraversal(Node node) {

        if(node == null) {
            return;
        }
        System.out.println(node.value);

        preorderTraversal(node.leftNode);
        preorderTraversal(node.rightNode);


    }


    public void postorderTraversal() {

    }






    public static void main(String[] args) {

        Node node = new Node(1);
        Node nodeLeft = new Node(2);
        Node nodeRight = new Node(3);
        Node nodeLeftLeft = new Node(4);
        Node nodeLeftRight = new Node(5);
        Node nodeRightLeft = new Node(6);
        Node nodeRightRight = new Node(7);

        DepthFirstTraversal depthFirstTraversal = new DepthFirstTraversal();
        depthFirstTraversal.root = node;
        depthFirstTraversal.root.leftNode = nodeLeft;
        depthFirstTraversal.root.rightNode = nodeRight;
        depthFirstTraversal.root.leftNode.leftNode = nodeLeftLeft;
        depthFirstTraversal.root.leftNode.rightNode = nodeLeftRight;
        depthFirstTraversal.root.rightNode.leftNode = nodeRightLeft;
        depthFirstTraversal.root.rightNode.rightNode = nodeRightRight;
        //depthFirstTraversal.inorderTraversal(depthFirstTraversal.root);
        //depthFirstTraversal.postorderTraversal();
        depthFirstTraversal.preorderTraversal(depthFirstTraversal.root);
    }
}
