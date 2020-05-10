class Solution {
    public int findJudge(int N, int[][] trust) {
        if(trust.length < N-1){
            return -1;
        }
        
        int[] trustedby=new int[N+1];
        int[] trusts=new int[N+1];
        
        for(int[] rel:trust){
            trusts[rel[0]]++;
            trustedby[rel[1]]++;
        }
        
        for(int i=1;i<N+1;i++){
            if(trusts[i]==0 && trustedby[i]==N-1){
                return i;
            }
        }
        
        return -1;
    }
}

