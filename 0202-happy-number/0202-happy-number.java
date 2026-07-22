class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a=n;
        while(a>1){
            a=check(a);
            if(!map.containsKey(a)){
                map.put(a,0);
            }
            else{
                break;
            }
        }
        if(a==1){
            return true;
        }
        return false;
    }
    public int check(int n){
        int a=0;
        while(n>0){
            a+=(n%10)*(n%10);
            n/=10;
        }
        return a;
    }
}