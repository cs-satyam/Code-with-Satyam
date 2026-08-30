 import java.util.*;

 class Solution {
     public int longestUniqueSubstr(String s) {

         int n = s.length();

         HashMap<Character, Integer> hm = new HashMap<>();

         int l = 0;
         int ans = 0;

         for (int i = 0; i < n; i++) {

             char ch = s.charAt(i);

             hm.put(ch, hm.getOrDefault(ch, 0) + 1);

             // Duplicate found
             while (hm.get(ch) > 1) {

                 char leftChar = s.charAt(l);

                 hm.put(leftChar, hm.get(leftChar) - 1);

                 if (hm.get(leftChar) == 0) {
                     hm.remove(leftChar);
                 }

                 l++;
             }

             // Maximum length
             ans = Math.max(ans, i - l + 1);
         }

         return ans;
     }
 }