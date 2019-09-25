import java.util.Scanner;

public class N1546{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        float[] arr = new float[cnt];
        int maxi = 0;
        float sum = 0;
        for(int i =0; i<cnt ; i++){
            int score = sc.nextInt();
            arr[i] = score;
            if (score>=maxi) maxi=score;
        }
        for(int i =0; i<cnt ; i++){
            sum += (float)(arr[i]/maxi*100);
        }
        System.out.println(sum/cnt);
        sc.close();
    }
}