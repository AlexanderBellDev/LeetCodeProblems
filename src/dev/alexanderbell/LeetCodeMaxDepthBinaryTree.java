package dev.alexanderbell;

public class LeetCodeMaxDepthBinaryTree {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        treeNode.left = left;
        TreeNode right = new TreeNode(3);
        treeNode.right = right;
        left.left = new TreeNode(4);
        right.right = new TreeNode(5);
        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        return traverseInOrder(root, 0);
    }

    static int traverseInOrder(TreeNode root, int count) {
        //if root is null return count
        // otherwise increment count as its a valid level
        // then find the max count of each side recursively
        if(root == null) return count;
        count++;
        return Math.max(traverseInOrder(root.left, count),traverseInOrder(root.right,count));
    }
}
