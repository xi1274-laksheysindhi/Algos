package binarytree;

class Node3
{
    int data;
    Node3 left, right;

    public Node3(int item)
    {
        data = item;
        left = right = null;
    }
}

// go deep to the depth till the leaf node then when leaf node is reached start returning back

public class BinaryTreeMinDepth {

    int minDepth(Node3 root) {

        // start returning back
        if(root == null) {
            return 0;
        }

        // now at every node back calculate min depth of left and right and take min of both and return
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        // return min of both both left and right but if tree has no right or left node then ignore that side
        return leftDepth == 0 ? rightDepth+1 : rightDepth == 0 ? leftDepth+1: Math.min(leftDepth, rightDepth)+1;

    }

    Node3 root;
    public static void main(String[] args) {
        BinaryTreeMinDepth tree = new BinaryTreeMinDepth();
        tree.root = new Node3(1);
        tree.root.left = new Node3(2);
        tree.root.right = new Node3(3);
        tree.root.left.left = new Node3(4);
        tree.root.left.right = new Node3(5);
        System.out.println(tree.minDepth(tree.root));
    }
}
