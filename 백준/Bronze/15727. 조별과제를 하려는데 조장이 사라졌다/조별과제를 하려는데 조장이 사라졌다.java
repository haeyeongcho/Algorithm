import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(true){
            if(num%5 == 0)
                break;
            num++;
        }
        System.out.println(num/5);
    }
}