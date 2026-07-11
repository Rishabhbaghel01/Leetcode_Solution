class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(i>0){
                map.put(i,i);
            }
        }
        int a=1;
        for(Integer key:map.keySet()){
            if(map.containsKey(a)){
                a++;
                if(map.containsKey(a)==false){
                    return a;
                }
            }
        }
        return 1;
    }
}