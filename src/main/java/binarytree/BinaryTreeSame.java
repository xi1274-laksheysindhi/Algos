package binarytree;


public class BinaryTreeSame {

    public static boolean isSame(Node root, Node root1) {

        if( root == null && root1 == null) {
            return true;
        }
        if(root == null  || root1 == null) {
            return false;
        }
        if( root.value != root1.value) {
            return false;
        }
        boolean leftSide = isSame(root.leftNode, root1.leftNode);
        boolean rightSide = isSame(root.rightNode, root1.rightNode);

        return leftSide && rightSide;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        BinaryTree binaryTree = new BinaryTree(root);
        root.leftNode = new Node(2);
      /*  root.rightNode = new Node(3);
        root.leftNode.leftNode = new Node(4);
        root.leftNode.rightNode = new Node(5);*/

        Node root1 = new Node(1);
        BinaryTree binaryTree1 = new BinaryTree(root);
        //root1.leftNode = new Node(2);
        root1.rightNode = new Node(2);
       /* root1.leftNode.leftNode = new Node(4);
        root1.leftNode.rightNode = new Node(5);*/

        System.out.println(isSame(root, root1));



    }
}
