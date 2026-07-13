class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int sorted[]=arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int i:sorted){
            if(map.containsKey(i)){
                int a=map.get(i);
                map.put(i,a);
            }
            else{
                map.put(i,r++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}