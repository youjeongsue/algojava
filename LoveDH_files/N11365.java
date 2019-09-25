import java.io.*;

public class N11365{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String s = br.readLine();
            char[] arr = s.toCharArray();
            if (s.equals("END")){
                break;
            }
            for (int i =s.length()-1; i>=0 ;i--){
                bw.write(arr[i]);
            }
            bw.write('\n');
        }
        bw.flush();
        bw.close();
        br.close();
    }
}