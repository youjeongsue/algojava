import java.io.*;
import java.util.StringTokenizer;

public class N4344{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for (int i =0; i<tc ; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int cnt = Integer.parseInt(st.nextToken());
            int[] scores = new int[cnt];
            int sum = 0;
            for (int j =0; j<cnt; j++){
                int score = Integer.parseInt(st.nextToken());
                sum += score;
                scores[j] = score;
            }
            float avg = sum/cnt;
            int higher = 0;
            for( int j =0; j<cnt; j++){
                if (scores[j]>avg) higher++;
            }
            bw.write(String.format("%.3f", (float)higher/(float)cnt*100)+"%\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}