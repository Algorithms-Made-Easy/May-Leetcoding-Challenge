class Solution {
    
    Map<Integer, Integer> color;
    
    public boolean possibleBipartition(int N, int[][] dislikes) {
        if(dislikes.length==0) return true;
        int[][] grid=new int[N][N];
        
        for(int[] i:dislikes){
            grid[i[0]-1][i[1]-1]++;
            grid[i[1]-1][i[0]-1]++;
        }
        color = new HashMap();
        for (int node = 0; node < N; ++node){
            if(!color.containsKey(node) && !dfs(node, 0,grid)){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(int node,int c,int[][] grid){
        if(color.containsKey(node)){
            return color.get(node)==c;
        }
        
        color.put(node,c);
        int[] val=grid[node];
        for(int i=0;i<val.length;i++){
            if(val[i]==1 && !dfs(i,c^1,grid)){
                return false;
            }
        }
        return true;
    }
}


class Solution {
    // union found split two group
    // GroupA : all hate b, GroupB: all hate a; 
    public boolean possibleBipartition(int N, int[][] dislikes) {
        int[] group = new int[N+1];
        for (int i = 0; i <= N; i++) {
            group[i] = i; // initial
        }
        
        for (int[] dislike : dislikes) {
            int a = dislike[0];
            int b = dislike[1];
            
            if (group[a] == a && group[b] == b) {
                group[a] = b;
                group[b] = a;
            } else if (group[a] == a && group[b] != b) {
                // let a go to group that all hate b;
                group[a] = group[group[b]];
            } else if (group[b] ==b && group[a] != a) {
                group[b] = group[group[a]];
            } else if (group[b] == group[a]) {
                return false;
            }
        }
        return true;        
    }
}
