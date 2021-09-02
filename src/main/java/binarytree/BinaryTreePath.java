package binarytree;


<<<<<<< HEAD


=======
>>>>>>> 77b0f41326b97ab0f532f9b68d0f5eeba23d00c4
import java.util.ArrayList;
import java.util.List;

class Node6 {
    int data;
    Node6 left, right;

    public Node6(int item) {
        data = item;
        left = right = null;
    }
}


public class BinaryTreePath {
    Node6 root = null;
    List<String> path = new ArrayList<>();


    int pathPosition = 0;
    String s = "";

    List<String> findPath1(Node6 root) {
        findpath(root, s);
        return path;
    }

    // We pass String So with every method as every method will maintain separate copy of String at each level
    //as it will be returining The node printed will be removed.
    // it will come to previous stage
    void findpath(Node6 root, String so) {

        // Exit condition
        if (root == null) {
            return;
        }

        // append to string
        if (so != null) {
            so = "".equalsIgnoreCase(so) ? "" + root.data : so + "->" + root.data;
        }

        // when come to leaf node add to list
        if (root.left == null && root.right == null) {

            path.add(so);

            return;

        }

        // iterating to left depth and then right
        findpath(root.left, so);
        findpath(root.right, so);
    }


    public static void main(String[] args) {
        BinaryTreePath tree = new BinaryTreePath();
        tree.root = new Node6(1);
        tree.root.left = new Node6(2);
        tree.root.right = new Node6(3);
        tree.root.left.right = new Node6(5);
        System.out.println(tree.findPath1(tree.root));
    }
}
