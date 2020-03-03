package binarytree;

// inorder traversal in a tree. keep a window of min and max value for node
// window depends as BST all the left node values will be lower than root and all right should be greater than root
public class ValidateBinarySearchTree98 {
    Node root;

    public static void main(String[] args) {
        Node node = new Node(0);

      /*  Node nodeLeft = new Node(0);*/
       /* Node nodeRight = new Node(3);*/
      /* Node nodeRight = new Node(2147483647);*/
       /* Node nodeRightLeft = new Node(14);
        Node nodeRightRight = new Node(20);*/

        ValidateBinarySearchTree98 levelOrderTreeTraversal = new ValidateBinarySearchTree98();
        levelOrderTreeTraversal.root = node;

/*
        levelOrderTreeTraversal.root.leftNode = nodeLeft;
*/


/*
        levelOrderTreeTraversal.root.rightNode = nodeRight;
*/

        /*levelOrderTreeTraversal.root.rightNode.leftNode = nodeRightLeft;
        levelOrderTreeTraversal.root.rightNode.rightNode = nodeRightRight;*/
        levelOrderTreeTraversal.isValidBST(node);
    }

    public boolean isValidBST(Node root) {


        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public boolean isValidBST(Node node, long min, long max) {
        if (node == null) {
            return true;
        }

        if(node.value == min || node.value == max) {
            return false;
        }



        return node.value <= min || node.value >= max
                ? false
                : isValidBST(node.leftNode, min, node.value)
                && isValidBST(node.rightNode, node.value, max);


    }

}
