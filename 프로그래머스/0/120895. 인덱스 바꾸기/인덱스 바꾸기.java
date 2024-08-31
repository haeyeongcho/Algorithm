import java.util.List;

class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_charArray = new char[my_string.length()];
        my_charArray = my_string.toCharArray();
        
        char item1 = my_charArray[num1];
        char item2 = my_charArray[num2];
        
        my_charArray[num1] = item2;
        my_charArray[num2] = item1;
        
        
        String answer = new String(my_charArray);
        return answer;
    }
}