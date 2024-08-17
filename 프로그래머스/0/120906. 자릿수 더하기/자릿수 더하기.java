class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++){
            int num = Integer.parseInt(String.valueOf(str.charAt(i)));
            answer += num;
        }
        return answer;
    }
}