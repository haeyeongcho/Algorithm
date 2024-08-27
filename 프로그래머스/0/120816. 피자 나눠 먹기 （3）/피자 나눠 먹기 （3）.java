class Solution {
    public int solution(int slice, int n) {
        int pizza = 1;
        while(true){
            if(pizza * slice >= n){
                break;
            }
            pizza++;
        }
        return pizza;
    }
}