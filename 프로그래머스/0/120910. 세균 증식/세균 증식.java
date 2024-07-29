class Solution {
    public int solution(int n, int t) {
        int i = 0;
        int answer = n;
        while(i < t){
            answer *= 2;
            i++;
        }
        
        return answer;
    }
}