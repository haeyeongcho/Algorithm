import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paperNum = sc.nextInt();
        int[][] board = new int[100][100];
        int area = 0;

        for (int i = 0; i < paperNum; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int j = n; j < n + 10; j++) {
                for (int k = m; k < m + 10; k++) {
                    if (board[j][k] == 1) {
                        continue;
                    }
                    board[j][k] = 1;
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}