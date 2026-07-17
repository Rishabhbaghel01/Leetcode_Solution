class Solution {
    public int maxScore(String s) {
        int max=0;
        for(int i=1;i<s.length();i++){
            int z=zero(s.substring(0,i));
            int o=one(s.substring(i));
            if(z+o>max){
                max=z+o;
            }
        }
        return max;
    }
    public int zero(String a){
        int max=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                max++;
            }
        }
        return max;
    }
    public int one(String a){
        int max=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='1'){
                max++;
            }
        }
        return max;
    }
}