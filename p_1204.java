//Array1
//최빈수 구하기

package sw;

import java.util.Scanner;

public class p_1204{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] result = new int[T];
        for(int i=0;i<T;i++){
            sc.nextInt();
            int[] test = new int[101];
            int score, max=0, most_score=0;
            for(int j=0;j<1000;j++){
                score = sc.nextInt();
                test[score]++;
            }
            for(int k=0;k<101;k++){
                if(test[k]>=max){
                    max = test[k];
                    most_score = k;
                }
            }
            result[i] = most_score;
        }

        //출력
        for(int i=0;i<T;i++){
            System.out.printf("#%d %d", i+1, result[i]);
            System.out.println();
        }

        sc.close();
    }
}