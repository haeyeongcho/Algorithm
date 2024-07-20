class Solution {
    public int[] solution(int n) {
        int index = 0;
        int[] answer = new int[(n+1)/2];
        
        for(int i = 1;i <= n;i++){
            if(i % 2 !=0){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}