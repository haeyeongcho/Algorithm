import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : numbers){
            list.add(num);
        }
        
        if(direction.equals("right")){
            list.add(0, list.remove(list.size()-1));
        }else if(direction.equals("left")){
            list.add(list.size() - 1, list.remove(0));
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}