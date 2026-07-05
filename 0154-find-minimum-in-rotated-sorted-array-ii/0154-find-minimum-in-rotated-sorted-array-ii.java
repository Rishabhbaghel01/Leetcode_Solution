class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int a=1;
        int b=nums.length-1;
        while(a<=b){
            if(nums[a]<=min){
                min=nums[a];
                a++;
            }
            else if(nums[b]<=min){
                min=nums[b];
                b--;
            }
            else{
                break;
            }
        }
        return min;
    }
}