import java.util.Scanner;

public class N10871{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(), max = sc.nextInt();
        int[] arr = new int[len];
        for (int i =0; i<len; i++){
            int tmp = sc.nextInt();
            arr[i] = tmp;
        }

        for (int i =0; i<len; i++){
            if(arr[i]<max)
                System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}