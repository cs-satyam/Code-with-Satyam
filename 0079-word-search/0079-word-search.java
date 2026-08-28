class Solution {
    public boolean exist(char[][] b, String word) {
        int m = b.length; 
        int n = b[0].length; 
        char[] arr = word.toCharArray(); 
    
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { // Fixed loop variable initialization and condition
                if (b[i][j] == arr[0]) {
                    if (dfs(b, i, j, arr, 0)) {
                        return true; 
                    } 
                } 
            } 
        } 
        return false; 
    } 

    static boolean dfs(char[][] b, int i, int j, char[] a, int idx) { // Changed void to boolean, Char to char
        // Fixed the typos here:
        if (i < 0 || i >= b.length || j < 0 || j >= b[0].length || b[i][j] != a[idx] || b[i][j] == '*') {
            return false;
        } 
        

        // If we reached the last character successfully
        if (idx == a.length - 1) return true; 
        
        
        char ch = b[i][j]; 
        b[i][j] = '*'; // Mark as visited
        
        boolean res = dfs(b, i + 1, j, a, idx + 1) || 
                      dfs(b, i - 1, j, a, idx + 1) || 
                      dfs(b, i, j + 1, a, idx + 1) || 
                      dfs(b, i, j - 1, a, idx + 1); 
                      
        b[i][j] = ch; // Backtrack
        return res; 
    } 
}