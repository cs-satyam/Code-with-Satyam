import java.util.*;
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> path = new  ArrayList<>();

        path.add(0);
        dfs(0,graph,path,res);
        return res;
      
        }
        void dfs(int curr,int [][] graph, List<Integer> path,List<List<Integer>> res){
            if(curr==graph.length-1){
                res.add(new ArrayList<>(path));
                //  System.out.println("path node in the res while adding"+res);
                return;
            }


            for(int e:graph[curr]){
                path.add(e);
                // System.out.println("path node in the loop"+path);
                dfs(e,graph,path,res);
                path.remove(path.size() - 1);  
            }
        }
}
