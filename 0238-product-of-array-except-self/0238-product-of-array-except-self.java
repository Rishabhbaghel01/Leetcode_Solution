class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro=1;
        int zero=0;
        for(int i:nums){
            if(i!=0){
                pro*=i;
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zero>0){
                if(zero>1){
                    nums[i]=0;
                }
                else if(nums[i]==0){
                    nums[i]=pro;
                }
                else{
                    nums[i]=0;
                }
            }
            else{
                nums[i]=pro/nums[i];
            }
        }
        return nums;
    }
}