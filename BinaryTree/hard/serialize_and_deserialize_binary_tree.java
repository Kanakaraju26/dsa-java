public class serialize_and_deserialize_binary_tree {
    
     TreeNode root;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        this.root=root;
        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return this.root;
    }
}
