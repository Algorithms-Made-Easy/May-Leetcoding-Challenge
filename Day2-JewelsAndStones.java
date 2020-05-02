class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        
        int[] stones=new int[128];
        
        for(char c:S.toCharArray()){
            stones[c]++;
        }
        int count=0;
        for(char c:J.toCharArray()){
            count+=stones[c];
        }
        
        return count;
    }
}