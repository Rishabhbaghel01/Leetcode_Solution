class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int a=map.get(i)+1;
                map.put(i,a);
            }
            else{
                map.put(i,0);
            }
            if(map.get(i)==3){
                map.remove(i);
            }
        }
        int ans=-1;
        for(Integer b:map.keySet()){
            if(map.get(b)==0){
                ans=b;
            }
        }
        return ans;
    }
}