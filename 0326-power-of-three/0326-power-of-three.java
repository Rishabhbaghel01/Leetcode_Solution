class Solution {
    public boolean isPowerOfThree(int n) {
        int count=0;
        int temp=n;
        while(n>=3){
            n=n/3;
            count++;
        }
        int no=1;
        for(int i=0;i<count;i++){
            no*=3;
        }
        if(n==1 && no==temp){
            return true;
        }
        return false;
    }
}