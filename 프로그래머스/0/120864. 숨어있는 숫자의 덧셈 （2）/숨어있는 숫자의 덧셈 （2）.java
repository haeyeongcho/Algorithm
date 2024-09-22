class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    int num = Integer.parseInt(sb.toString());
                    answer += num;
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            int num = Integer.parseInt(sb.toString());
            answer += num;
        }
        
        return answer;
    }
}
