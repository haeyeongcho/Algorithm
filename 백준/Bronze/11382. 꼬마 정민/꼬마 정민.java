import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num[] = new long[3];
        long sum = 0;
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextLong();
        }

        for(int i=0;i<num.length;i++){
            sum += num[i];
        }
        System.out.println(sum);
    }
}