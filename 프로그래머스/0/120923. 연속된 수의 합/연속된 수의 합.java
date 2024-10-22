import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        ArrayList<Integer> list = new ArrayList<>();
        
        if(total % num == 0){
            int mid = total / num;
            list.add(mid);
            for(int i = 0; i < (num-1) / 2; i++){
                list.add(mid-1-i);
                list.add(mid+1+i);
            }
        }else{
            int mid = total / num;
            for(int i = 0; i < num / 2; i++){
                list.add(mid-i);
                list.add(mid+1+i);
            }
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        
        return result;
//         1 2 3 4 5 6, 21 /6 == 3.5
//         2. total / num이 나누어 떨어질 때
//         - 12 / 3 == 4
//         - 양 옆으로 3, 5 -> 3, 4, 5
//         3. total / num이 나누어 떨어지지 않을 때
//         - 14 / 4 == 3.5
//         - 양 옆으로 2, 3, 4, 5
        
//         ArrayList 선언해서 요소를 추가하고
//         오름차순으로 정렬 -> Collections.sort();
//         
    }
}