class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] result = arr.clone();
        for(int[] items : queries){
            int s = items[0];
            int e = items[1];
            int k = items[2];
            for(int i = s; i <= e; i++){
                if(i % k == 0){
                    result[i]++;
                }
            }
        }
        return result;
    }
}