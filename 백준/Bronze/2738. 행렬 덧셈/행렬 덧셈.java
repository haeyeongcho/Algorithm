import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[][] arr1= new int[num1][num2];
        int[][] arr2= new int[num1][num2];
        int[][] sum = new int[num1][num2];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println("");
        }
    }
}