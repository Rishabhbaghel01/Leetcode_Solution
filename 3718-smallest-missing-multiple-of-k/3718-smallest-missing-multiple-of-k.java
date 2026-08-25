class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        int no=k;
        while(a<nums.length){
            if(nums[a]==k){
                k+=no;
            }
            a++;
        }
        return k;
    }
}