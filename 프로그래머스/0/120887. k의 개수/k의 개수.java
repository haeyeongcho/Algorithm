class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        int num = i;
        while(num <= j){
            String str = String.valueOf(num);
            for(int idx = 0; idx < str.length(); idx++){
                if(String.valueOf(str.charAt(idx)).equals(String.valueOf(k))){
                    answer++;
                }
            }
            num++;
        }
        return answer;
    }
}