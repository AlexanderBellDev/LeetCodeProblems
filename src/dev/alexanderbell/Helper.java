package dev.alexanderbell;

import java.util.ArrayList;

public class Helper {
    static class BST {
        private TreeNode root;

        public BST() {
            root = null;
        }
        
        public TreeNode returnBst(){
            return this.root;
        }

        public void insert(int val) {
            if (root == null) {
                root = new TreeNode(val);
            } else {
                TreeNode currentNode = root;

                while (true) {
                    if (val <= currentNode.val && currentNode.left != null) {
                        currentNode = currentNode.left;
                        continue;
                    }
                    if (val <= currentNode.val) {
                        currentNode.left = new TreeNode(val);
                        break;
                    }
                    if (currentNode.right != null) {
                        currentNode = currentNode.right;
                        continue;
                    }
                    currentNode.right = new TreeNode(val);
                    break;
                }

            }

        }

        public TreeNode lookup(int val) {
            TreeNode currentNode = root;
            while (true) {
                if (currentNode.val == val) return currentNode;
                if (val < currentNode.val) {
                    if (currentNode.left == null) return null;
                    if (currentNode.left.val == val) return currentNode.left;
                    currentNode = currentNode.left;
                    continue;
                }
                if (val > currentNode.val) {
                    if (currentNode.right == null) return null;
                    if (currentNode.right.val == val) return currentNode.right;
                    currentNode = currentNode.right;
                }
            }
        }

        public void remove(int val) {
            TreeNode parentOfNodeToDelete = null;
            TreeNode nodeToDelete = null;
            TreeNode currentNode = root;
            boolean left = false;
            if (currentNode.val == val) {
                parentOfNodeToDelete = currentNode;
            } else {
                while (true) {
                    if (val < currentNode.val) {
                        if (currentNode.left == null) break;
                        if (currentNode.left.val == val) {
                            parentOfNodeToDelete = currentNode;
                            nodeToDelete = currentNode.left;
                            left = true;
                            break;
                        }
                        currentNode = currentNode.left;
                        continue;
                    }
                    if (val > currentNode.val) {
                        if (currentNode.right == null) break;
                        if (currentNode.right.val == val) {
                            parentOfNodeToDelete = currentNode;
                            nodeToDelete = currentNode.right;
                            break;
                        }
                        currentNode = currentNode.right;
                    }
                }
            }
            if (nodeToDelete != null) {
                if (nodeToDelete.left == null && nodeToDelete.right == null) {
                    //no children
                    if (left) parentOfNodeToDelete.left = null;
                    if (!left) parentOfNodeToDelete.right = null;
                }
                if (nodeToDelete.left != null && nodeToDelete.right == null || nodeToDelete.left == null && nodeToDelete.right != null) {
                    //one child
                    if (nodeToDelete.left != null) {
                        nodeToDelete.val = nodeToDelete.left.val;
                        nodeToDelete.left = null;
                    }
                    if (nodeToDelete.right != null) {
                        nodeToDelete.val = nodeToDelete.right.val;
                        nodeToDelete.right = null;
                    }
                }
                if (nodeToDelete.left != null && nodeToDelete.right != null) {
                    //two children
                    // start at right subtree
                    TreeNode currentNodeSubtree = nodeToDelete.right;
                    if (currentNodeSubtree.left == null && currentNodeSubtree.right == null) {
                        // right subtree has no children
                        nodeToDelete.val = currentNodeSubtree.val;
                        nodeToDelete.right = null;
                    } else if (currentNodeSubtree.left != null) {
                        TreeNode parentNode = currentNodeSubtree.left;
                        while (parentNode.left != null) {
                            if (parentNode.left.left != null) {
                                parentNode = parentNode.left;
                            } else {
                                break;
                            }
                        }
                        if (parentNode.left != null) {
                            nodeToDelete.val = parentNode.left.val;
                            parentNode.left = null;
                        } else {
                            nodeToDelete.val = parentNode.val;
                            currentNode.left = null;
                        }


                    }

                }
            }


        }

        public ArrayList<Integer> dfsInOrder() {
            return traverseInOrder(this.root, new ArrayList<>());
        }
        public ArrayList<Integer> dfsPreOrder() {
            return traversePreOrder(this.root, new ArrayList<>());
        }
        public ArrayList<Integer> dfsPostOrder() {
            return traversePostOrder(this.root, new ArrayList<>());
        }

        private ArrayList<Integer> traverseInOrder(TreeNode root, ArrayList<Integer> items) {
            if (root.left != null) {
                traverseInOrder(root.left, items);
            }
            items.add(root.val);
            if (root.right != null) {
                traverseInOrder(root.right, items);
            }
            return items;
        }

        private ArrayList<Integer> traversePreOrder(TreeNode root, ArrayList<Integer> items) {
            items.add(root.val);
            if (root.left != null) {
                traversePreOrder(root.left, items);
            }
            if (root.right != null) {
                traversePreOrder(root.right, items);
            }
            return items;
        }

        private ArrayList<Integer> traversePostOrder(TreeNode root, ArrayList<Integer> items) {
            if (root.left != null) {
                traversePostOrder(root.left, items);
            }
            if (root.right != null) {
                traversePostOrder(root.right, items);
            }
            items.add(root.val);
            return items;
        }
    }
}
