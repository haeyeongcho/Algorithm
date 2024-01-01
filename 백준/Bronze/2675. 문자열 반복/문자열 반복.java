import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] n = new int[num];
        String[] s = new String[num];

        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
            s[i] = sc.next();
        }
        for (int i = 0; i < num; i++) {
            for(int j=0;j<s[i].length();j++){
                    char ch = s[i].charAt(j);
                for(int k=0;k<n[i];k++) {
                    System.out.print(ch);
                }
            }
            System.out.println("");
        }
    }
}