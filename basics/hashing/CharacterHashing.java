package basics.hashing;

import java.util.*;

public class CharacterHashing {

    private static Map<Character, Integer> charHash(String str) {

        Map<Character, Integer> hm = new HashMap<>();

        // storing freq in a hash array
        int[] hash = new int[256];
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i)]++;
        }
        // print character with its corresponding freq

        // for (int i = 0; i < hash.length; i++) {
        // if (hash[i] != 0) {
        // System.out.println((char) (i + 'a') + ": " + hash[i]);
        // }
        // }

        // or return

        for (int i = 0; i < hash.length; i++) {
            hm.put((char) (i), hash[i]);
        }
        return hm;
    }

    public static void main(String[] args) {
        String str = "your coding nemesis";
        for (Map.Entry<Character, Integer> entry : charHash(str).entrySet()) {
            if (entry.getValue() != 0)
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}