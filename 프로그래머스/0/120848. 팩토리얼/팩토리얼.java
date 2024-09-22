class Solution {
    public int solution(int n) {
        int num = 1;
        int mul = 1;
        while(true){
            num *= mul;
            
            if(n < num){
                mul--;
                break;
            }else if(n == num){
                break;
            }
            
            mul++;
        }
        return mul;
    }
}