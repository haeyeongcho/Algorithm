import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 3;

        for (int i = 1; i < N; i++) {
            result += (int) Math.pow(2, i);
        }

        System.out.println(result * result);
    }
}