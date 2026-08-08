class Solution {
    public List<Integer> majorityElement(int[] nums) {  
        Arrays.sort(nums);
        int n= nums.length;
        int count = 0;
        int times = n/3; 
        int val = 0; 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0 ;i<n;i++){ 
            count = 0;
            val  = nums[i] ;
            while(i<n && nums[i]==val){
            count++;
            i++;
            }
            i--; 
            if(count>times){ 
                list.add(val);
            }
        }
        return list;
        
    }
}