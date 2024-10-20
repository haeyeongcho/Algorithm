class Solution {
    public String solution(String my_string, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++){
            my_string = reverseString(my_string, queries[i]);
        }
            
        return my_string;
    }
    public static String reverseString(String my_string, int[] querie){
        char[] my_chars = my_string.toCharArray();
        int x = querie[0];
        int y = querie[1];
        
        for(int i = 0; i < (y - x + 1) / 2; i++){
            char temp = my_chars[x + i];
            my_chars[x + i] = my_chars[y - i];
            my_chars[y - i] = temp;
        }
        
        return String.valueOf(my_chars);
    }
}