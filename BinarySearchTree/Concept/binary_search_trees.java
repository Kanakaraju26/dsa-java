package BinarySearchTree.Concept;

public class binary_search_trees {
    static boolean isBSTTraversal(int arr[]) {
        // code here
        int max = 0;
        for(int i:arr){
            if(i>max) max = i;
            else return false;
        }
        return true;
    }
}
