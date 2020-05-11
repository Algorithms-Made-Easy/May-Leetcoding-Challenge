class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
       return helper(image,sr,sc,image[sr][sc],newColor);
    }
    
    int[][] helper(int[][] image,int sr,int sc,int oldColor,int newColor){
         if(outlimit(sr,image.length) || outlimit(sc,image[0].length) || image[sr][sc]==newColor || image[sr][sc]!=oldColor){
            return image;
        }
        image[sr][sc]=newColor ; 
        image=helper(image,sr+1,sc,oldColor,newColor);
        image=helper(image,sr-1,sc,oldColor,newColor);
        image=helper(image,sr,sc+1,oldColor,newColor);
        image=helper(image,sr,sc-1,oldColor,newColor);
        
        return image;
    }
    
    boolean outlimit(int val,int limit){
        return val<0 || val>limit-1;
    }
}