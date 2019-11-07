import java.util.*;
import java.io.*;

public class N1874 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        int topush = 1;
        int popcount = 0;
        while (true) {
            if (topush <= arr[idx]) {
                st.push(topush);
                bw.write("+\n");
            } else if (topush > arr[idx]) {
                ans[popcount] = st.pop();
                bw.write("-\n");
                idx++;
                popcount++;
                if (idx == n)
                    break;
                continue;
            }
            topush++;
        }

        boolean answer = true;
        for (int i = 0; i < n; i++) {
            if (arr[i] != ans[i]) {
                answer = false;
                break;
            }
        }

        if (answer)
            bw.flush();
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
            System.out.println("NO");
        }
        bw.close();
        sc.close();
    }
}