import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine());


        for (int i = 0; i < P; i++) {
            int TTT = 0, TTH = 0, THT = 0, THH = 0, HTT = 0, HTH = 0, HHT = 0, HHH = 0;
            String input = br.readLine();
            for (int j = 0; j < input.length() - 2; j++) {
                if (input.charAt(j) == 'T') {
                    if (input.charAt(j + 1) == 'T') {
                        if (input.charAt(j + 2) == 'T') {
                            TTT++;
                        } else if (input.charAt(j + 2) == 'H') {
                            TTH++;
                        }
                    } else if (input.charAt(j + 1) == 'H') {
                        if (input.charAt(j + 2) == 'T') {
                            THT++;
                        } else if (input.charAt(j + 2) == 'H') {
                            THH++;
                        }
                    }
                } else if (input.charAt(j) == 'H') {
                    if (input.charAt(j + 1) == 'T') {
                        if (input.charAt(j + 2) == 'T') {
                            HTT++;
                        } else if (input.charAt(j + 2) == 'H') {
                            HTH++;
                        }
                    } else if (input.charAt(j + 1) == 'H') {
                        if (input.charAt(j + 2) == 'T') {
                            HHT++;
                        } else if (input.charAt(j + 2) == 'H') {
                            HHH++;
                        }
                    }
                }
            }
            bw.write(TTT+" "+TTH+" "+THT+" "+THH+" "+HTT+" "+HTH+" "+HHT+" "+HHH+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}