package string.easy;

public class rotate_string {
    public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String n = s+s;
        return n.contains(goal);
    }
    public static void main(String[] args) {
        System.out.println(rotateString("null", "null"));
    }
}
