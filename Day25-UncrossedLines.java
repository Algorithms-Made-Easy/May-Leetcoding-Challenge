class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int matrix[][] = new int[A.length+1][B.length+1]; 
  
        for (int i=1; i<=A.length; i++) 
        { 
          for (int j=1; j<=B.length; j++) 
          { 
            if (A[i-1] == B[j-1]) 
                matrix[i][j] = matrix[i-1][j-1] + 1; 
            else
                matrix[i][j] = Math.max(matrix[i-1][j], matrix[i][j-1]); 
          } 
        } 
        return matrix[A.length][B.length];
    }
}
