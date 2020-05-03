class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length()>magazine.length()) return false;
        int[] indexArr=new int[26];
        
        for(char c:ransomNote.toCharArray()){
            int index = magazine.indexOf(c,indexArr[c-'a']);
            
            if(index==-1){
                return false;
            }
            
            indexArr[c-'a']=index+1;
        }
        
        return true;
    }
}