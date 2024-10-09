class Solution {
    public String[] solution(String my_str, int n) {
        int idx = n;
        String[] answer = {};
        StringBuilder sb = new StringBuilder(my_str);
        while(true){
            sb.insert(idx, " ");
            idx+= n+1;
            if(idx > sb.length())
                break;
        }
        String str = sb.toString();
        answer = str.split(" ");
        return answer;
    }
}