class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=1;
        for(String j:sentences){
            int a=1;
            for(int i=0;i<j.length();i++){
                if(j.charAt(i)==' '){
                    a++;
                }
            }
            if(a>max){
                max=a;
            }
        }
        return max;
    }
}