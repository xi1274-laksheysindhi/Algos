package binarytree;

class Node10
{
    int data;
    Node10 left, right;

    public Node10(int item)
    {
        data = item;
        left = right = null;
    }
}

// Inorder traversal and incrementing count till reach the count == given count then return value
public class KthSmallestElementBST {

    Node10 root;
    int count =0;
    int data = 0;

    public int kthSmallest(Node10 root, int k) {

        if(root == null) {
            return 0;
        }
        kthSmallest(root.left, k);
        count++;
        if(count == k) {
            return data = root.data;
        }
        kthSmallest(root.right, k);
        return data;
    }
    public static void main(String[] args) {
        KthSmallestElementBST tree = new KthSmallestElementBST();
        tree.root = new Node10(3);
        tree.root.left = new Node10(1);
        tree.root.right = new Node10(4);
        tree.root.left.right = new Node10(2);
        System.out.println(tree.kthSmallest(tree.root, 1));
    }

}
