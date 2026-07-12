class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                int a=map.get(i)+1;
                map.put(i,a);
            }
            else{
                map.put(i,1);
            }
        }
        int max=-1;
        for(Integer b:map.keySet()){
            if(b.equals(map.get(b)) && max<b){
                max=b;
            }
        }
        return max;
    }
}