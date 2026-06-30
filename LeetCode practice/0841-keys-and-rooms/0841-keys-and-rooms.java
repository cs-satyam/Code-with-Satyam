import java.util.*;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean v[]= new boolean [n];
        v[0]=true;
        dfs(0,rooms,v);
        for(boolean ele:v){
            if(!ele) return false;
        }
        return true;  
}
    public void dfs(int start, List<List<Integer>> adj,boolean v[]){
        
        for(int ele:adj.get(start)){
            if(!v[ele]){
                v[ele]=true;
                 dfs(ele,adj,v);
            }

        }
    }
}