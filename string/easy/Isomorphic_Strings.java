package string.easy;

import java.util.*;
public class Isomorphic_Strings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check s -> t mapping
            if (mapST.containsKey(charS)) {
                // If already mapped to a different character, return false
                if (mapST.get(charS) != charT) return false;
            } else {
                // Otherwise, create the new mapping
                mapST.put(charS, charT);
            }

            // Check t -> s mapping
            if (mapTS.containsKey(charT)) {
                // If already mapped to a different character, return false
                if (mapTS.get(charT) != charS) return false;
            } else {
                // Otherwise, create the new mapping
                mapTS.put(charT, charS);
            }
        }

        // If we have completed the loop without issues, strings are isomorphic
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("nnnono", "mmmininu"));
    }
}
