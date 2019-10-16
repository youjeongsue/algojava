import java.io.*;

public class N9012 {
    static int count;
    static boolean bracket;

    public static void check(char letter) {
        switch (letter) {
        case '(':
            count++;
            bracket = true;
            break;
        case ')':
            count--;
            break;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            bracket = false;
            count = 0;
            char[] str_arry = br.readLine().toCharArray();
            for (int j = 0; j < str_arry.length; j++) {
                check(str_arry[j]);
                if(count <0) break;
            }
            if (count == 0 && bracket)
                bw.write("YES\n");
            else
                bw.write("NO\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}