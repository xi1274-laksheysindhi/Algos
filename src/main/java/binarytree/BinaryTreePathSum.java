package binarytree;

class Node7
{
    int data;
    Node7 left, right;

    public Node7(int item)
    {
        data = item;
        left = right = null;
    }
}


public class BinaryTreePathSum {
    Node7 root = null;

    boolean status = false;



    public boolean hasPathSum(Node7 root, int finalSum) {

         return findpathSum(root,0,finalSum);
    }

    boolean findpathSum(Node7 root, int currentSum, int finalSum) {

        if(status == true) {
            return true;
        }
        // Exit condition
        if(root == null) {
            return false;
        }


        currentSum = currentSum+root.data;

        // when come to leaf node add to list
        if(root.left == null && root.right == null) {
           return status  =  currentSum == finalSum ? true :  false;

        }


            findpathSum(root.left, currentSum, finalSum);


            findpathSum(root.right, currentSum, finalSum);



        return status;
    }



    public static void main(String[] args) {
        BinaryTreePathSum tree = new BinaryTreePathSum();
        tree.root = new Node7(5);
        tree.root.left = new Node7(4);
        tree.root.right = new Node7(8);
        tree.root.left.left = new Node7(11);
        tree.root.left.left.left = new Node7(7);
        tree.root.left.left.right = new Node7(2);
        tree.root.right.left = new Node7(13);
        tree.root.right.right = new Node7(4);
        tree.root.right.right.right = new Node7(1);
        System.out.println(tree.hasPathSum(tree.root, 22));
    }
}

