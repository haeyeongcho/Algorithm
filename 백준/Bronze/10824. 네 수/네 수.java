import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        
        String str1 = inputs[0] + inputs[1];
        String str2 = inputs[2] + inputs[3];
        long result = Long.parseLong(str1) + Long.parseLong(str2);
        
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
