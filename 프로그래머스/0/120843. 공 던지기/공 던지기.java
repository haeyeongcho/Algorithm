class Solution {
    public int solution(int[] numbers, int k) {
        int thrower = 1;
        int people = numbers.length;
        for(int i = 1; i < k; i++){
            thrower += 2;
            if(thrower > people){
                thrower %= people;
            }
        }
        return thrower;
    }
}