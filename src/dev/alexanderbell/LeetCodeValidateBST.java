package dev.alexanderbell;

import java.util.ArrayList;

public class LeetCodeValidateBST {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        treeNode.left = left;
        TreeNode right = new TreeNode(3);
        treeNode.right = right;
        left.left = new TreeNode(4);
        right.right = new TreeNode(5);
        System.out.println(isValidBST(treeNode));
    }
    public static boolean isValidBST(TreeNode root) {
        ArrayList<Integer> integers = traverseInOrder(root, new ArrayList<>());
        for (int i = 0; i < integers.size()-1; i++) {
            if(integers.get(i) >= integers.get(i+1)){
                return false;
            }
        }
        return true;
    }

    static ArrayList<Integer> traverseInOrder(TreeNode root, ArrayList<Integer> items) {
        if (root.left != null) {
            traverseInOrder(root.left, items);
        }
        items.add(root.val);
        if (root.right != null) {
            traverseInOrder(root.right, items);
        }
        return items;
    }
}
