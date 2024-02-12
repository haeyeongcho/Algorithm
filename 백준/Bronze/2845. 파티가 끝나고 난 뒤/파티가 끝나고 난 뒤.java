import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = L * P;

        int[] participant = new int[5];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < participant.length; i++) {
            int pow = Integer.parseInt(st.nextToken());
            participant[i] = pow - result;
            System.out.print(participant[i]+" ");
        }
    }
}