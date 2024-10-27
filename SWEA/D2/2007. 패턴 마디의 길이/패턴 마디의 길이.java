import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            String str = sc.nextLine();

            for (int i = 1; i <= 10; i++) {
                if (str.substring(0, i).equals(str.substring(i + 1, 2 * i + 1))) {
                    System.out.println("#" + test_case + " " + (i + 1));
                    break;
                }
            }
        }
    }
}