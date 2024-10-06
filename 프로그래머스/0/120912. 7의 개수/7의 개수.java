class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i : array){
            String str = Integer.toString(i);
            for(char c : str.toCharArray()){
                if(c == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}