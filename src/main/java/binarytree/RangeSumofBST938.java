package binarytree;

public class RangeSumofBST938 {

    static int sum = 0;

    public static int rangeSumBST(TreeNode root, int L, int R) {

        return rangeSum(root, L, R);

    }

    public static int rangeSum(TreeNode root, int L, int R) {
        if(root == null) {
            return sum;
        }


        if(root.val < L) {
            return rangeSum(root.right, L, R);
        } else if(root.val > R) {
            return rangeSum(root.left, L, R);
        }


        sum = sum + root.val;

        rangeSum(root.left, L, R);
        rangeSum(root.right, L, R);


        return sum;
    }

    public static void main(String[] args) {

       TreeNode root = new TreeNode(10);
       root.left = new TreeNode(5);
       root.right = new TreeNode(15);
       root.left.left = new TreeNode(3);
       root.left.right = new TreeNode(7);
       root.right.right = new TreeNode(18);
       rangeSumBST(root, 7, 15);
    }
}
