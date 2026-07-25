class Solution {
    public int maxProduct(int n) {
        int max=0;
        int min=0;
        while(n>0){
            int temp=n%10;
            if(temp>max){
                min=max;
                max=temp;
            }
            else if(temp>min){
                min=temp;
            }
            n/=10;
        }
        return max*min;
    }
}