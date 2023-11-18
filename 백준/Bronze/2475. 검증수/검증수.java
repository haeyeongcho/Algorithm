import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[5];
        int[] s = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            s[i] = n[i] * n[i];
            sum += s[i];
        }
        int answer = sum % 10;
        System.out.println(answer);
    }
}