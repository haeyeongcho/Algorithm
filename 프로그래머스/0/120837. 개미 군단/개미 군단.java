class Solution {
    public int solution(int hp) {
        int Hp = hp; // 23
        int answer = 0;
        int 장군개미 = 5;
        int 병정개미 = 3;
        int 일개미 = 1;
        if(Hp / 장군개미 >= 1){
            answer += Hp / 장군개미;
            Hp %= 장군개미; 
        } if(Hp / 병정개미 >=1){
            answer += Hp / 병정개미; 
            Hp %= 병정개미;
        } if(Hp / 일개미 >= 1){
            answer += Hp / 일개미;
        }
        return answer;
    }
}