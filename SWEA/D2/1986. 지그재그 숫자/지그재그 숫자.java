import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int num = sc.nextInt();
            int result = 0;

            for (int j = 1; j <= num; j++) {
                if (j % 2 == 1) {
                    result += j;
                } else {
                    result -= j;
                }
            }

            System.out.println("#"+i+" "+result);
        }
    }
}