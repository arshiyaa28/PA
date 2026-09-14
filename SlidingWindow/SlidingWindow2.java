// Sliding WIndow --> variable ;ength window

import java.util.*;

class Main {
    public static int lengthof(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxlength = 0;
        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);
            while (set.contains(curr)) { // checks duplicate
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthof(s));
    }
}