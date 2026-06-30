import java.util.HashMap;

class Solution {
    public int numberOfSubstrings(String s) {
        // Maps each character ('a', 'b', 'c') to its latest index position
        HashMap<Character, Integer> lastSeen = new HashMap<>();
        int count = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            // Update the position of the current character
            lastSeen.put(s.charAt(i), i);
            
            // Check if we have successfully tracked all 3 unique characters
            if (lastSeen.size() == 3) {
                // Find the character that is furthest to the left
                int minIndex = Math.min(lastSeen.get('a'), 
                               Math.min(lastSeen.get('b'), lastSeen.get('c')));
                
                // All substrings starting from index 0 up to minIndex are valid
                count += (minIndex + 1);
            }
        }
        
        return count;
    }
}
