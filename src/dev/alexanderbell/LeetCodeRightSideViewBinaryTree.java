package dev.alexanderbell;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class LeetCodeRightSideViewBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        treeNode.left = left;
        TreeNode right = new TreeNode(3);
        treeNode.right = right;
        right.right = new TreeNode(6);
        right.left = new TreeNode(10);
        TreeNode right1 = new TreeNode(5);
        left.right = right1;
        TreeNode left2 = new TreeNode(4);
        left.left = left2;
        TreeNode left1 = new TreeNode(7);
        left2.right = left1;
        System.out.println(rightSideView(treeNode));
    }
//BFS SOLUTION
//    public static List<Integer> rightSideView(TreeNode root) {
//        if (root == null) return new ArrayList<>();
//        List<Integer> rightMost = new ArrayList<>();
//        rightMost.add(root.val);
//        Deque<TreeNode> q = new ArrayDeque<>();
//        q.add(root);
//        while (!q.isEmpty()) {
//            Deque<TreeNode> children = new ArrayDeque<>();
//            while (!q.isEmpty()) {
//                TreeNode node = q.pop();
//                if (node.left != null) children.add(node.left);
//                if (node.right != null) children.add(node.right);
//            }
//            if(!children.isEmpty()) rightMost.add(children.getLast().val);
//            q = children;
//        }
//        return rightMost;
//    }



    //DFS SOLUTION
    // CONVERT FROM LOOKING FROM LEFT FIRST TO RIGHT FIRST
    // THIS ALLOWS ALL THE RIGHT MOST NODE TO BE FOUND FIRST
    // KEEP TRACK OF THE LEVEL AND ONLY ADD THE FIRST ELEMENT FOR THAT LEVEL
    // THIS CAN BE CHECKED BY MAKING SURE THE LEVEL IS EQUAL TO THE SIZE OF THE LIST
    // WHICH ENSURES ONLY THE FIRST NODE ON EACH LEVEL IS ADDED
    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        return traversePreOrder(root, new ArrayList<>(),0);
    }

    private static ArrayList<Integer> traversePreOrder(TreeNode root, ArrayList<Integer> items, int level) {
     if(level == items.size()) items.add(root.val);
        level++;
        if (root.right != null) {
            traversePreOrder(root.right, items,level);
        }
        if (root.left != null) {
            traversePreOrder(root.left, items,level);
        }

        return items;
    }
}
