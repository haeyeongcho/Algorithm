import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num /= 4;
        String str = "";
        for(int i = 0;i<num;i++){
            str += "long ";
        }
        str += "int";
        System.out.println(str);
    }
}