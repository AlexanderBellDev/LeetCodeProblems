package dev.alexanderbell;

public class TreeNode {
        int val;
        dev.alexanderbell.TreeNode left;
        dev.alexanderbell.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, dev.alexanderbell.TreeNode left, dev.alexanderbell.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
