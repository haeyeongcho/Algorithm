import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = BigInteger.ONE;
        
        for(int i = 0; i < balls - share; i++){
            answer = answer.multiply(BigInteger.valueOf(balls-i));
            answer = answer.divide(BigInteger.valueOf(i+1));
        }
        
        return answer.intValue();
    }
}