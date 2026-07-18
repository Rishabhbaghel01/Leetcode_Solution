class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            if(i<min){
                min=i;
            }
            else if(i>max){
                max=i;
            }
        }
        return gcd(min,max);
    }
    public int gcd(int min,int max){
        if(max%min==0){
            return min;
        }
        int temp=min;
        min=max%min;
        return gcd(min,temp);
    }
}