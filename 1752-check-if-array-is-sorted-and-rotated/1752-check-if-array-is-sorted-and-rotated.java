class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int l=1;
        while(count<=1 && l<nums.length){
            if(nums[l]<nums[l-1]){
                count++;
            }
            l++;
        }
        if(count>1 || (count==1 && nums[0]<nums[nums.length-1])){
            return false;
        }
        return true;
    }
}