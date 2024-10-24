import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1;
        
        for (int i = 0; i <= n; i++) {
            System.out.print(result + " ");
            result *= 2;
        }
    }
}