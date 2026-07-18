class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int a=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)>=a){
                    a=map.get(c)+1;
                }
                map.put(c,i);
            }
            else{
                map.put(c,i);
            }
            int dis=i-a+1;
            if(dis>max){
                max=dis;
            }
        }
        return max;
    }
}