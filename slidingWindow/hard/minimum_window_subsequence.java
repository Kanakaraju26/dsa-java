package slidingWindow.hard;

public class minimum_window_subsequence {
    static String minWindow(String s1, String s2) {
        // code here
           int n1 = s1.length();
        int n2 = s2.length();
        String ans = "";
        
        for (int i = 0; i <= n1 - n2; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int j = 0;
                int k = i;

                while (k < n1 && j < n2) {
                    if (s1.charAt(k) == s2.charAt(j)) {
                        j++;
                    }
                    k++;
                }

                if (j == n2) {
                    String tmp = s1.substring(i, k);
                    if (ans.isEmpty() || tmp.length() < ans.length()) {
                        ans = tmp;
                    }
                }
            }
        }
        return ans;
    }
}
