import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[] price = new int[N];

            for (int i = 0; i < N; i++) {
                price[i] = sc.nextInt();
            }

            int maxPrice = 0;
            long result = 0;
            
            for (int i = N - 1; i >= 0; i--) {
                if (price[i] > maxPrice) {
                    maxPrice = price[i];
                } else {
                    result += maxPrice - price[i];
                }
            }

            System.out.println("#" + test_case + " " + result);
        }
    }
}