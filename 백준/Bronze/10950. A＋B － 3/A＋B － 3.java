import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<arr.length;i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            arr[i] = n1 + n2;
        }
        for(int i : arr){
            System.out.println(i);
            }
    }
}