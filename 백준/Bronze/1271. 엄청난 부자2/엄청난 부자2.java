import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = sc.nextBigInteger();
        BigInteger n2 = sc.nextBigInteger();

        System.out.println(n1.divide(n2));
        System.out.println(n1.mod(n2));
    }
}
