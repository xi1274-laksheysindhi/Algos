package binarytree;


class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
  }

public class isBinaryTreeSymetric {

    public static boolean isSymmetric(TreeNode root) {

       return checkIfMirror(root, root);
    }

    static boolean checkIfMirror(TreeNode node1, TreeNode node2) {

        if(node1 == null && node2 == null) {
            return true;
        }

        if(node1 != null && node2 != null &&node1.val == node2.val) {
            return (checkIfMirror(node1.left, node2.right) && checkIfMirror(node1.right, node2.left));
        }
        return false;
    }



    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(2);
        //tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(3);
       // tree.right.left = new TreeNode(5);
        tree.right.right = new TreeNode(3);
        /*tree.left.left.left = null;
        tree.left.left.right = null;
        tree.left.right.left = new TreeNode(8);
        tree.left.right.right = new TreeNode(9);
        tree.right.left.left = new TreeNode(9);
        tree.right.left.right = new TreeNode(8);*/
        System.out.println(isSymmetric(tree));

    }
}
