import java.util.HashSet;
import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int num = 1;

            while(true){
                String input = String.valueOf(N * num);
                for (int j = 0; j < input.length(); j++) {
                    set.add(input.charAt(j));
                }
                if (set.size() == 10) {
                    break;
                }
                num++;
            }
            set.clear();
            System.out.println("#" + (i+1) + " " + N * num);
        }
    }
}