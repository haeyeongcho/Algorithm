import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for(char item : my_string.toCharArray()) {
            if(item >= '0' && item <= '9') {
                list.add(Integer.parseInt(Character.toString(item)));
            }
        }
        
        Collections.sort(list);
        
        int[] result = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}