package BinaryTree.medium;

import BinaryTree.TreeNode;
public class balanced_binary_tree {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return Height(root)!=-1;
    }
    public int Height(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftHeight= Height(root.left);
        int rightHeight = Height(root.right);

        if(leftHeight==-1 || rightHeight==-1){  // edge case
            return -1;
        }   

        if(Math.abs(leftHeight-rightHeight)>1){   // conditions for height balanced is that A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one. 

            return -1; // if differs return -1
        }

        return Math.max(leftHeight,rightHeight)+1;  // otherwise return the height 
    }
}
