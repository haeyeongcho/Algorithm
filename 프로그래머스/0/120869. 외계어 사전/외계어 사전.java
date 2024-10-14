import java.util.HashSet;

class Solution {
    public int solution(String[] spell, String[] dic) {
        HashSet<String> set1 = new HashSet();
        for(String item : spell){
            set1.add(item);
        }
        
        for(int i = 0; i < dic.length; i++){
            HashSet<String> set2 = new HashSet();
            for(int j = 0; j < dic[i].length(); j++){
                set2.add(String.valueOf(dic[i].charAt(j)));
            }
            if(set1.equals(set2)){
                return 1;
            }
        }
        
        return 2;
    }
}