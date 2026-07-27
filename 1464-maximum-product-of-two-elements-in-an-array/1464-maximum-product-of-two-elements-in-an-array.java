class Solution {
    public int maxProduct(int[] nums) {
        int min=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                min=max;
                max=nums[i]-1;
            }
            else if(nums[i]>min){
                min=nums[i]-1;
            }
        }
        return min*max;
    }
}