class Solution {
    public boolean detectCapitalUse(String word) {
        int a=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>=65 && word.charAt(i)<=90){
                a++;
            }
        }
        if(a==word.length() || word.length()==1 || a==0){
            return true;
        }
        else if(a==1 && (word.charAt(0)>=65 && word.charAt(0)<=90)){
            return true;
        }
        return false;
    }
}