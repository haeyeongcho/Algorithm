import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        
        Collections.sort(list);
        
        int d1 = list.get(0);
        int d2 = list.get(1);
        int d3 = list.get(2);
        int d4 = list.get(3);
        
        if(d1 == d2 && d2 == d3 && d3 == d4){
            answer = 1111 * d1;
        }else if(d1 == d2 && d2 == d3 && d3 != d4){
            answer = (int)Math.pow(10 * d1 + d4, 2);
        }else if(d1 != d2 && d2 == d3 && d3 == d4){
            answer = (int)Math.pow(10 * d4 + d1, 2);
        }else if(d1 == d2 && d3 == d4){
            answer = (d1 + d3) * Math.abs(d1 - d3);
        }else if(d1 == d2 && d2 != d3 && d3 != d4){
            answer = d3 * d4;
        }else if(d1 != d2 && d2 == d3 && d3 != d4){
            answer = d1 * d4;
        }else if(d1 != d2 && d2 != d3 && d3 == d4){
            answer = d1 * d2;
        }
        else if(d1 != d2 && d3 == d4){
            answer = d1 * d2;
        }else if(d1 != d2 && d2 != d3 && d3 != d4){
            answer = d1;
        }
        
        return answer;
    }
}