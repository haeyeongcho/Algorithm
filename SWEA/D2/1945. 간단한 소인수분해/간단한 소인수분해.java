import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            while (true) {
                if (N % 11 == 0) {
                    N /= 11;
                    e++;
                } else if (N % 7 == 0) {
                    N /= 7;
                    d++;
                } else if (N % 5 == 0) {
                    N /= 5;
                    c++;
                } else if (N % 3 == 0) {
                    N /= 3;
                    b++;
                } else if (N % 2 == 0) {
                    N /= 2;
                    a++;
                } else if (N == 1) {
                    break;
                }
            }
            
            System.out.println("#" + (i + 1) + " " + a + " " + b + " " + c + " " + d + " " + e);
            a = 0;
            b = 0;
            c = 0;
            d = 0;
            e = 0;
        }
    }
}