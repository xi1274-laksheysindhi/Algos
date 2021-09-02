package binarytree;


 class Node2
{
    int data;
    Node2 left, right;

    public Node2(int item) {
        data = item;
        left = right = null;
    }
}

// go deep to the depth till the leaf node then when leaf node is reached start returning back
public class BinaryTreeMaxDepth {

     int maxDepth(Node2 root) {
        // start returning back once null
         if(root == null) {
             return 0;
         }
        // now at every node back calculate max depth of left and right and take max of both and return
         int leftDepth = maxDepth(root.left);
         int rightDepth = maxDepth(root.right);

         // taking max of left and right complete tree
         return Math.max(leftDepth, rightDepth) +1;

     }

    Node2 root;
 public static void main(String[] args) {
     BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();
     tree.root = new Node2(1);
     tree.root.left = new Node2(2);
     tree.root.right = new Node2(3);
     tree.root.left.left = new Node2(4);
     tree.root.left.right = new Node2(5);
     System.out.println(tree.maxDepth(tree.root));
 }
}
