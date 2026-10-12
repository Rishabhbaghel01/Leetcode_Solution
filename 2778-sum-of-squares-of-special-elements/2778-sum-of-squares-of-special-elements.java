class Solution {
    public int sumOfSquares(int[] nums) {
        int l=nums.length;
        int ans=nums[l-1]*nums[l-1];
        for(int i=0;i<l/2;i++){
            if(l%(i+1)==0){
                ans+=nums[i]*nums[i];
            }
        }
        return ans;
    }
}