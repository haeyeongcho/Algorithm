import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        for(int i=0;i<n;i++){
            sum += Character.getNumericValue(s.charAt(i));
        }
        bw.write(String.valueOf(sum));

        br.close();
        bw.close();
    }
}