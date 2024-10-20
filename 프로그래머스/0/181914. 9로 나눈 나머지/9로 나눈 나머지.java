class Solution {
    public int solution(String number) {
        int answer = 0;
        for(char ch : number.toCharArray()){
            answer += Integer.parseInt(Character.toString(ch));
        }
        answer %= 9;
        return answer;
    }
}