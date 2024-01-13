import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = i+1;
        }
        int index = 0;
        int count = 0;
        int num_count = 0;
        bw.write("<");
        while (true) {
            if (num_count == permutation.length) {
                break;
            }
            if (index == permutation.length) {
                index = 0;
            }
            if (permutation[index] != 0) {
                count++;
                if (count == K) {
                    if (num_count == permutation.length - 1) {
                        bw.write(permutation[index]+ ">");
                        break;
                    }
                    bw.write(permutation[index]+ ", ");
                    num_count++;
                    permutation[index] = 0;
                    count = 0;
                }
                index++;
            }else if (permutation[index] == 0){
                index++;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}