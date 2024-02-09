import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String end_num = N;
        int left;
        int right;
        int result;
        int count = 0;

        while (true) {
            if (Integer.parseInt(N) < 10) {
                left = 0;
                right = Integer.parseInt(N);
            } else {
                left = Integer.parseInt(N) / 10;
                right = Integer.parseInt(N) % 10;
            }
            
            result = left + right;
            
            if (result >= 10) {
                result = result % 10;
            }
            
            N = Integer.toString(right) + Integer.toString(result);
            
            count++;
            
            if (Integer.parseInt(N) == Integer.parseInt(end_num)) {
                break;
            }
        }
        System.out.println(count);
    }
}