import java.util.ArrayList;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String items : quiz) {
            String[] item = items.split(" ");
            int a = Integer.parseInt(item[0]);
            String operator = item[1];
            int b = Integer.parseInt(item[2]);
            int result = Integer.parseInt(item[4]);
            boolean isCorrect;

            if (operator.equals("+")) {
                isCorrect = (a + b == result);
            } else {
                isCorrect = (a - b == result);
            }

            arrayList.add(isCorrect ? "O" : "X");
        }
        
        return arrayList.toArray(new String[0]);
    }
}
