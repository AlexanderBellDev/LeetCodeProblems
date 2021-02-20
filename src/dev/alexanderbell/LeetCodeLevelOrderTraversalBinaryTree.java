package dev.alexanderbell;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeLevelOrderTraversalBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.val = 1;
        TreeNode left = new TreeNode(2);
        treeNode.left = left;
        TreeNode right = new TreeNode(3);
        treeNode.right = right;
//        right.right = new TreeNode(4);
        left.left = new TreeNode(4);
        System.out.println(levelOrder(treeNode));
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> listAtEachLevel = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        e.add(root.val);
        listAtEachLevel.add(e);
        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        ArrayList<Integer> integers = new ArrayList<>();
        while (!q.isEmpty()) {
            Deque<TreeNode> children = new ArrayDeque<>();
            while (!q.isEmpty()) {
                TreeNode node = q.pop();
                if (node.left != null) {
                    children.add(node.left);
                    integers.add(node.left.val);
                }
                if (node.right != null) {
                    children.add(node.right);
                    integers.add(node.right.val);
                }


            }
            if(!integers.isEmpty()){
                listAtEachLevel.add(integers);
                integers.clear();
            }
            q = children;
        }

        return listAtEachLevel;
    }
}
