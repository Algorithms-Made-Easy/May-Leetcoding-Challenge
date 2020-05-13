class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb=new StringBuilder(num);
        
        while(k-->0){
            int i=1;
            for(;i<sb.length();i++){
                if(sb.charAt(i-1)>sb.charAt(i)){
                    break;
                }
            }
            
            sb.delete(i-1,i);
            
            i=0;
            for(;i<sb.length();i++){
                if(sb.length()==1 || sb.charAt(i)!='0'){
                    break;
                }
            }
            if(i>0)
                sb.delete(0,i);
            
        }
        
        return sb.length()==0?"0":sb.toString();
    }
}