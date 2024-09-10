class Solution {
    public String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        
        for(int i = 0; i < str.length(); i++){
            char ch = (char) (str.charAt(i) - '0' + 'a');
            answer += ch;
        }
        return answer;
    }
}