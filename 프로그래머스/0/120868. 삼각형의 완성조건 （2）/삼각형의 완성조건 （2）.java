class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int a = sides[0] > sides[1] ? sides[0] : sides[1];
        int b = sides[0] > sides[1] ? sides[1] : sides[0];
        
        for(int i = a - b + 1; i <= a; i++){
            answer++;
        }
        
        for(int i = a + 1; i < a + b; i++){
            answer++;
        }
        
        return answer;
    }
}