package string.medium;

public class maximum_nesting_depth_of_the_parentheses {
    public static int maxDepth(String s) {
        int count = 0;
        int maxcount = 0;
        
        for(Character c:s.toCharArray()){
            if(c=='(') count++;
            if(c==')') count--;
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        System.out.println(maxDepth("null"));
    }
}
