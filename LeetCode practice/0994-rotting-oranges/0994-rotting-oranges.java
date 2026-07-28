class Solution {
    public int orangesRotting(int[][] mat) {
        int n = mat.length;
		int m = mat[0].length;
		Queue<int []>q = new LinkedList<>();
		int fresh = 0;
		int vis[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				if (mat[i][j] == 2) {
					q.offer(new int[] {i, j, 0});
					vis[i][j] = 2;
				}
				
				if (mat[i][j] == 1)
					fresh++;
			}
		}
		int dRow[] = {-1, 0, 1, 0};
		int dCol[] = {0, 1, 0, -1};
		
		int time = 0;
		int c = 0;
		
		while (!q.isEmpty()) {
			int [] curr = q.poll();
			int row = curr[0];
			int col = curr[1];
			int t = curr[2];
			
			time = Math.max(time, t);
			
			for (int i = 0; i<4; i++) {
				int nRow = row + dRow[i];
				int nCol = col + dCol[i];
				
				if (nRow >= 0 && nRow < n &&
				nCol >= 0 && nCol < m &&
				vis[nRow][nCol] == 0 &&
				mat[nRow][nCol] == 1) {
					
					q.offer(new int[] {nRow, nCol, t + 1});
					vis[nRow][nCol] = 2;
					fresh--;
				}
			}
		}
		if (fresh != 0)return - 1;
		else return time;
    }
}