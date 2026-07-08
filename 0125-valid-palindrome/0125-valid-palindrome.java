class Solution {
    public boolean isPalindrome(String s) {
        String ans=new String("");
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                ans+=s.charAt(i);
            }
            else if(s.charAt(i)-'0'>=0 && s.charAt(i)-'0'<10){
                ans+=s.charAt(i);
            }
        }
        ans=ans.toLowerCase();
        if(find(ans)==true){
            return true;
        }
        return false;
    }
    public boolean find(String ans){
        int a=0;
        int b=ans.length()-1;
        while(a<b){
            if(ans.charAt(a)!=ans.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}