import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N4716{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] NeedsnDist = new int[n][3];
        int[][] empty = new int[n][2];
        for (int i = 0; i<=n; i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j = 0; j<3; j++){
                NeedsnDist[i][j] = Integer.parseInt(line.nextToken());
            }  
        }
        
        while(true){
            for(i=0; i<n; i++){
                
            }
        }
    }
}