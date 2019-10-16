import java.util.*;

public class N1018{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] wb = new char[8][8];
        char[][] bw = new char[8][8];
        int b = 1;
        for(int i = 0; i<8; i++){
            for(int j = 0 ; j<8 ; j++){
                if (b==1){
                    wb[i][j]='W';
                    bw[i][j]='B';
                    b=-b;
                }
                else{
                    wb[i][j]='B';
                    bw[i][j]='W';
                    b = -b;
                }
            }
            b=-b;
        }
        String num = sc.nextLine();
        StringTokenizer st = new StringTokenizer(num);
        int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        char[][] arr = new char[M][N];
        for (int i = 0; i<M; i++){
            arr[i] = sc.nextLine().toCharArray();
        }
        
        int min=64,cnt_bw, cnt_wb;

        for(int i = 0; i<=M-8; i++){
            for(int j = 0; j<=N-8; j++){
                cnt_wb = 0;
                cnt_bw = 0;
                for(int k =0; k <8; k++){
                    for( int l=0; l<8;l++){
                        if (wb[k][l]!=arr[i+k][j+l]){
                            cnt_wb++;
                        }
                        else if (bw[k][l]!=arr[i+k][j+l]){
                            cnt_bw++;
                        }
                    }
                }
                int min_tmp = Math.min(cnt_wb,cnt_bw);
                if (min >= min_tmp) min = min_tmp;
            }
        }
        System.out.println(min);
        sc.close();
    }
}