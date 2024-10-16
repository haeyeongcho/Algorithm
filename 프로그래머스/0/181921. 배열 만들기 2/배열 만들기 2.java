import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            String str = Integer.toString(i);
            boolean flag = true;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) != '5' && str.charAt(j) != '0'){
                    flag = false;
                }
            }
            if(flag){
                list.add(i);    
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}