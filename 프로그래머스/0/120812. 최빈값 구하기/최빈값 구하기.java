class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] index = new int[1000];
        int[] count = new int[1000];

        for(int i = 0; i < index.length; i++){
            index[i] = i;
        }
            
        for(int number : array){
            count[number]++;
        }
        
        for(int i = 0; i < count.length - 1; i++){
            for(int j = 0; j < count.length - 1; j++){
                if(count[j] < count[j+1]){
                    int temp = count[j+1];
                    count[j+1] = count[j];
                    count[j] = temp;
                    
                    temp = index[j+1];
                    index[j+1] = index[j];
                    index[j] = temp;
                }
            }
        }
        
        if(count[0] == count[1]){
            return -1;
        }else{
            return index[0];
        }
    }
}