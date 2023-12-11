import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print((int)(num * 0.78)+" ");
        System.out.print((int)(num - (num*0.2*0.22)));
    }
}