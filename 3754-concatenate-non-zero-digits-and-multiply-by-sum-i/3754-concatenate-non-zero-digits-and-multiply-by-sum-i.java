class Solution {
    public long sumAndMultiply(int n) {
        long temp=0;
        long sum=0;
        int zero=1;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                temp=temp+(rem*zero);
                sum+=rem;
                zero*=10;
            }
            n=n/10;
        }
        return temp*sum;
    }
}