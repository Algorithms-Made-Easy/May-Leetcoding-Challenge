class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==1){
                    ans++;
                    if(i>0 && j>0 && matrix[i-1][j]>0 && matrix[i][j-1]>0 && matrix[i-1][j-1]>0){
                        int min=Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                        matrix[i][j]=min+1;
                        ans+=min;
                    }
                }
            }
        }
        
        return ans;
    }
}