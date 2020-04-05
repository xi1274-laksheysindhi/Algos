package binarytree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {

    static List<List<Integer>> intArr = new ArrayList<>();

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {


        if ((sum == 0 && root == null ) || root == null) {
            return new ArrayList<>();
        }
        if (root.right == null && root.left == null && root.val == sum) {
            List al = new ArrayList<>();
            al.add(root.val);
            List l = new ArrayList<>();
            l.add(al);
            return l;
        }
        pathsumFinder(root, sum, 0, new ArrayList());

        return new ArrayList(intArr);

    }

    public static void pathsumFinder(TreeNode treeNode, int sum, int currentSum, ArrayList currentArray) {
        currentSum = currentSum + treeNode.val;
        currentArray.add(treeNode.val);

        if (sum == currentSum && treeNode.right == null && treeNode.left == null) {
            if (currentArray.size() > 1) {
                intArr.add(new ArrayList<>(currentArray));
            }
        }

        if (treeNode.right == null && treeNode.left == null) {
            return;
        }

        if (treeNode.left != null) {
            pathsumFinder(treeNode.left, sum, currentSum, currentArray);
            currentArray.remove(currentArray.size() - 1);

        }
        if (treeNode.right != null) {
            pathsumFinder(treeNode.right, sum, currentSum, currentArray);
            currentArray.remove(currentArray.size() - 1);

        }

    }

    public static void main(String[] args) {

      /*  TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);*/
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
       // root.right = new TreeNode(8);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);
      /*  root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);*/



        pathSum(root, 6);
    }
}
