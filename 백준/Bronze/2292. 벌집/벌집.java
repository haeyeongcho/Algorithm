import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int n = 1;
        int distance = 1;

        while (true) {
            if (num == 1) {
                System.out.println(1);
                break;
            }
            distance++;
            i = i + 6 * n;
            if (num <= i) {
                System.out.println(distance);
                break;
            }
            n++;
        }
    }
}