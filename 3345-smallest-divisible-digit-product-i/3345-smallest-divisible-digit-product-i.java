class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(find(i,t)){
                return i;
            }
        }
        return n;
    }
    public boolean find(int a, int t){
        int p=1;
        while(a>0){
            p=p*(a%10);
            a/=10;
        }
        if(p%t==0){
            return true;
        }
        return false;
    }
}