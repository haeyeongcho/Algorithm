import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result1 = 0;
        int result2 = 0;

        for(int i =1;i<=n;i++){
            result1 += i;
            result2 += i*i*i;
        }
        System.out.println(result1);
        System.out.println(result1*result1);
        System.out.println(result2);

    }
}