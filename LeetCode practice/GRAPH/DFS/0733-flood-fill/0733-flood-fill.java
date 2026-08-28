

 class Q_07733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldColor=image[sr][sc];

        if(oldColor==color){
            return image;
        }
        dfs(image,sr,sc,color,oldColor);
        return image;


        
    }

    static void dfs(int gf[][], int r, int c,int color,int oldColor){

        if(r<0||r>=gf.length||c<0||c>=gf[0].length){
            return;
        }
        if (gf[r][c] != oldColor)
            return;
        gf[r][c]=color;
        dfs(gf, r + 1, c, color, oldColor);
        dfs(gf, r - 1, c, color, oldColor);
        dfs(gf, r, c + 1, color, oldColor);
        dfs(gf, r, c - 1, color, oldColor);
    
    }

    
}