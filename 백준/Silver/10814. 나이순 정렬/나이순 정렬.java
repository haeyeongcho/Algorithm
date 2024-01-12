import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Member implements Comparable<Member> {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Member other) {
        if (this.age == other.age) {
            return 0;
        }
        return Integer.compare(this.age, other.age);
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        Member[] members = new Member[input];

        for (int i = 0; i < input; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age, name);
        }
        Arrays.sort(members);
        for (Member member : members) {
            bw.write(member.age + " " + member.name);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}