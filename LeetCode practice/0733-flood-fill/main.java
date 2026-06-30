public class main {
    public static void main(String[] args) {
        Q_07733 s = new Q_07733();
        int [][]graph={
                {1,2,2,4},
                {1,2,3,4},
                {1,2,4,3},
        };
       s.floodFill(graph,0, 0,1);
       for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
