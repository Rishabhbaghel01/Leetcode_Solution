class Solution {
    public int possibleStringCount(String word) {
        ArrayList<Character> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<word.length();i++){
            if(!list.contains(word.charAt(i))){
                list.add(word.charAt(i));
            }
            else if(list.contains(word.charAt(i)) && word.charAt(i)==word.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}