import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int N = sc.nextInt();

            int n = 0;

            while (A <= N && B <= N) {
                if (A > B) {
                    B += A;
                    n++;
                } else {
                    A += B;
                    n++;
                }
            }
            System.out.println(n);
        }
    }
}