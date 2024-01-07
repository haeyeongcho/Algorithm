import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] == 1)
                continue;
            if (num[i] == 2) {
                result++;
                continue;
            }
            for (int j = 2; j < num[i]; j++) {
                if (num[i] % j != 0) {
                    if (num[i] == j + 1)
                        result++;
                } else
                    break;
            }
        }
        System.out.println(result);
    }
}