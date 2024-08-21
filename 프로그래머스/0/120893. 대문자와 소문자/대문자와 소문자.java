class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(Character item : my_string.toCharArray()){
            if(Character.isUpperCase(item)){
                answer += Character.toLowerCase(item);
            }else{
                answer += Character.toUpperCase(item);
            }
        }
        return answer;
    }
}