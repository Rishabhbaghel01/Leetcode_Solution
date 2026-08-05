class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        int a=nums[0];
        int b=0;
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
            if(a>nums[i]){
                a=nums[i];
            }
            else if(b<nums[i]){
                b=nums[i];
            }
        }
        for(int i=a;i<=b;i++){
            if(!list.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}