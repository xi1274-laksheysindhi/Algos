package binarytree;

class Node1
{
    int data;
    Node1 left, right;

    public Node1(int item)
    {
        data = item;
        left = right = null;
    }
}

public class LowestCommonAncestor {
    Node1 root;


    Node1 findLCA(Node1 root, Node1 n1, Node1 n2) {

        // will return if we are searching in left and elements are present on right side
        if(root == null) {
            return null;
        }
        // breaking the condition or exit condition  like when root reaches to any one node to be found
        // return that node
        if(root.data == n1.data || root.data == n2.data) {
            return root;
        }

        // going to  left side of tree deep deep deep
        Node1 leftChild = findLCA(root.left, n1, n2);

        // going to  right side of tree after completing left side
        Node1 rightChild = findLCA(root.right, n1, n2);

        // this condition will occur if both are on diffrent side of tree
        // or one is not parent of other
        if(leftChild != null && rightChild != null) {
            return root;
        }


        // condition will occur when one is parent of second
        return leftChild != null ? leftChild : rightChild ;
    }




    public static void main(String args[])
    {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
        tree.root.left.left.left =  new Node1(8);
        tree.root.left.left.right =  new Node1(9);
        tree.root.left.right.left =  new Node1(10);
        tree.root.left.right.right =  new Node1(11);

        System.out.println(tree.findLCA(tree.root,tree.root.left.right.left, tree.root.left.right.right).data);

    }
}
