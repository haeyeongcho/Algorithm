import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String str = String.valueOf(i);
            boolean clap = false;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9') {
                    System.out.print("-");
                    clap = true;
                }
            }
            if (!clap) {
                System.out.print(str + " ");
            } else {
                System.out.print(" ");
            }
        }
    }
}