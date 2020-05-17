class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length()<p.length()) return new ArrayList<>();
        int[] pArray=new int[26];
        int[] sArray=new int[26];
        List<Integer> res=new ArrayList<>();
        for(char c:p.toCharArray()){
            pArray[c-'a']++;
        }
        int plength=p.length();
        char ch[]=s.toCharArray();
        
        for(int i=0;i<plength-1;i++){
            sArray[ch[i]-'a']++;
        }
        
        for(int i=plength-1;i<ch.length;i++){
            sArray[ch[i]-'a']++;
            if(anagram(pArray,sArray)){
                res.add(i-plength+1);
                
            }
            sArray[ch[i-plength+1]-'a']--;
        }
        
        return res;
    }
    
    boolean anagram(int[] first,int[] second){
        for(int i=0;i<26;i++){
            if(first[i]!=second[i]){
                return false;
            }
        }
        return true;
    }
}