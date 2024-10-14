class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String item : keyinput){
            switch(item){
                case "up":
                    if(answer[1]+1 > board[1] / 2)
                        break;
                    answer[1]++;
                    break;
                case "down":
                    if(answer[1]-1 < -board[1] / 2)
                        break;
                    answer[1]--;
                    break;
                    case "left":
                    if(answer[0]-1 < -board[0] / 2)
                        break;
                    answer[0]--;
                    break;
                case "right":
                    if(answer[0]+1 > board[0] / 2)
                        break;
                    answer[0]++;
                    break;
                default:
                    break;
            }
        }
        return answer;
    }
}