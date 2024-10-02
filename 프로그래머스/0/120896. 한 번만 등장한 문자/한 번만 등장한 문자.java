class Solution {
    public String solution(String s) {
        int[] idx = new int[26];
        for(char c : s.toCharArray()){
            idx[(int)(c - 'a')]++;
        }
        String answer = "";
        for(int i=0;i<idx.length;i++){
            if(idx[i] == 1){
                answer+=(char)('a'+i);
            }
        }
        return answer;
    }
}