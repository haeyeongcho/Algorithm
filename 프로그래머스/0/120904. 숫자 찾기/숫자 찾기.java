import java.util.ArrayList;

class Solution {
    public int solution(int num, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        String str = Integer.toString(num);
        
        for(char c : str.toCharArray()){
            arrayList.add(Character.getNumericValue(c));
        }
        
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == k){
                return i+1;
            }
        }
        return -1;
    }
}