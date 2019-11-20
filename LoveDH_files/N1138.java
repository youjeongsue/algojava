import java.util.*;

public class N1138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int leftCount;

        for (int val = 0; val < n; val++) {
            leftCount = sc.nextInt();

            for (int i = 0; i < n; i++) {
                // N보다 키가 큰 사람을 모두 건너왔고, arr[i]에 아무런 숫자가 없다면
                if (leftCount == 0 && arr[i] == 0) {
                    arr[i] = val + 1;
                    break;
                    // N키보다 키가 큰 부분
                } else if (arr[i] == 0) {
                    leftCount--;
                }
            }
        }

        for (int f : arr) {
            System.out.print(f + " ");
        }
        sc.close();
    }
}