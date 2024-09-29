import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        String[] str_array = s.split(" ");
        
        for(String item : str_array){
            if(item.equals("Z")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(Integer.parseInt(item));    
            }
        }
        
        for(Integer element : stack){
            answer+= element;
        }
        return answer;
    }
}