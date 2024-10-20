class Solution {
    public int[] solution(int[] emergency) {
        int[] emergencyLevel = new int[emergency.length];
        int level = 1;
        int i = 100;
        while(i != 0){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[j] == i){
                    emergencyLevel[j] = level;
                    level++;
                }
            }
            i--;
        }
        return emergencyLevel;
    }
}