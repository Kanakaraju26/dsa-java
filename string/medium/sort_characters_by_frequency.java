package string.medium;

import java.util.HashMap;

public class sort_characters_by_frequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for (int i = 0; i <= n - 1; i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        while (hm.size() > 0) {
            char mostFrequentChar = '$';
            int mostFrequency = 0;

            for (char p : hm.keySet()) {
                if (hm.get(p) > mostFrequency) {
                    mostFrequency = hm.get(p);
                    mostFrequentChar = p;
                }
            }

            while (mostFrequency > 0) {
                sb.append(mostFrequentChar);
                mostFrequency--;
            }

            hm.remove(mostFrequentChar);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(frequencySort("null"));
    }
}
