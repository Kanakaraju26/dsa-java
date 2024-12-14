package BinaryTree.medium;

import java.util.Stack;

import BinaryTree.TreeNode;
public class same_tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
    if (p == null || q == null) return false;

    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();

    stack1.push(p);
    stack2.push(q);

    while (!stack1.isEmpty() && !stack2.isEmpty()) {
        TreeNode current1 = stack1.pop();
        TreeNode current2 = stack2.pop();

        // Compare the values of the nodes.
        if (current1.val != current2.val) return false;

        // Push right child to stack.
        if (current1.right != null && current2.right != null) {
            stack1.push(current1.right);
            stack2.push(current2.right);
        } else if (current1.right != null || current2.right != null) {
            return false; // One tree has a right child, the other does not.
        }

        // Push left child to stack.
        if (current1.left != null && current2.left != null) {
            stack1.push(current1.left);
            stack2.push(current2.left);
        } else if (current1.left != null || current2.left != null) {
            return false; // One tree has a left child, the other does not.
        }
    }

    // If both stacks are empty, trees are the same.
    return stack1.isEmpty() && stack2.isEmpty();
    }
}
