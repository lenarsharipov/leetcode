package com.algos.tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class BinaryTree {

    private TreeNode root;

    public void preOrderIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    public void preOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void inOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    private static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        System.out.println(root);
        /*
                             9
                   2                 3
            4             5
         */
    }

    public static void main(String[] args) {
        var tree = new BinaryTree();
        tree.createBinaryTree();
        // Recursive PreOrder Traversal
        System.out.println("Recursive PreOrder Traversal");
        tree.preOrderRecursive(tree.root);
        System.out.println();

        // Iterative PreOrder Traversal
        System.out.println("Iterative PreOrder Traversal");
        tree.preOrderIterative(tree.root);
        System.out.println();

        // Recursive InOrder Traversal
        System.out.println("Recursive InOrder Traversal");
        tree.inOrderRecursive(tree.root);
        System.out.println();

    }
}
