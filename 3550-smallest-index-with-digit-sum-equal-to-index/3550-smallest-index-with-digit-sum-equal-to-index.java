class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i==index(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int index(int a){
        int ans=0;
        while(a>0){
            ans+=a%10;
            a/=10;
        }
        return ans;
    }
}