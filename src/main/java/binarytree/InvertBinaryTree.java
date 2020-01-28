package binarytree;

class Node4
{
    int data;
    Node4 left, right;

    public Node4(int item)
    {
        data = item;
        left = right = null;
    }
}
public class InvertBinaryTree {

    // invert a binary tree start recursively  then swap left and right and go recursively down then swap
    void invert(Node4 root) {

        if(root == null) {
            return;
        }
        Node4 left = root.left;
        root.left = root.right;
        root.right = left;
        invert(root.left);
        invert(root.right);

    }

    Node4 root;
    public static void main(String[] args) {
        InvertBinaryTree tree = new InvertBinaryTree();
        tree.root = new Node4(1);
        tree.root.left = new Node4(2);
        tree.root.right = new Node4(3);
        tree.root.left.left = new Node4(4);
        tree.root.left.right = new Node4(5);
        tree.invert(tree.root);
        System.out.println(tree);
    }
}
