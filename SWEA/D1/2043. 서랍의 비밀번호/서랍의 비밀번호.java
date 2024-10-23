import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int K = sc.nextInt();
        int n = 1;

        while(P != K){
            if(P == K){
                break;
            }
            K++;
            n++;
        }
        
        System.out.println(n);
    }
}