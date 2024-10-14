import java.util.HashSet;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();
        int num = n;
        int div = 2;
        while(num != 1){
            if(num % div == 0){
                set.add(div);
                num /= div;
                div=2;
            }else{
                div++;
            }
        }
        
        int[] answer = new int[set.size()];
        int i = 0;
        for(int value : set){
            answer[i++] = value;
        }
        Arrays.sort(answer);
        
        return answer;
    }
}