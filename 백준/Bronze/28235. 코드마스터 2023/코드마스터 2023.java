import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        switch (input) {
            case "SONGDO":
                bw.write("HIGHSCHOOL");
                break;
            case "CODE":
                bw.write("MASTER");
                break;
            case "2023":
                bw.write("0611");
                break;
            case "ALGORITHM":
                bw.write("CONTEST");
                break;
            default:
                bw.write("UNKNOWN");
                break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}