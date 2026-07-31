class Solution {
    public String[] findWords(String[] words) {
        ArrayList<Character> list1=new ArrayList<>(List.of('Q','W','E','R','T','Y','U','I','O','P','q','w','e','r','t','y','u','i','o','p'));
        ArrayList<Character> list2=new ArrayList<>(List.of('A','S','D','F','G','H','J','K','L','a','s','d','f','g','h','j','k','l'));
        ArrayList<Character> list3=new ArrayList<>(List.of('Z','X','C','V','B','N','M','z','x','c','v','b','n','m'));
        int l=words.length;
        ArrayList<String> result=new ArrayList<>();
        for(int i=0;i<l;i++){
            String s=words[i];
            if(s.length()==1){
                result.add(s);
            }
            else if(list1.contains(s.charAt(0))){
                for(int j=1;j<s.length();j++){
                    if(j==s.length()-1 && list1.contains(s.charAt(j))){
                        result.add(s);
                    }
                    else if(!list1.contains(s.charAt(j))){
                        break;
                    }
                }
            }
            else if(list2.contains(s.charAt(0))){
                for(int j=1;j<s.length();j++){
                    if(j==s.length()-1 && list2.contains(s.charAt(j))){
                        result.add(s);
                    }
                    else if(!list2.contains(s.charAt(j))){
                        break;
                    }
                }
            }
            else if(list3.contains(s.charAt(0))){
                for(int j=1;j<s.length();j++){
                    if(j==s.length()-1 && list3.contains(s.charAt(j))){
                        result.add(s);
                    }
                    else if(!list3.contains(s.charAt(j))){
                        break;
                    }
                }
            }
        }
        String str[]=result.toArray(new String[0]);
        return str;
    }
}