import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class N2196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i, j;
        int[][] cnt = new int[n][4];
        int[] result = new int[n];
        int maxValue = Integer.MIN_VALUE;
        String findName;
        LinkedList<String> list = new LinkedList<>();
        for (i = 0; i < n; i++) {
            arr[i] = sc.next();
            // 그냥 더해줌.
            findName = arr[i] + name;
            for (j = 0; j < findName.length(); j++) {
                if (findName.substring(j, j + 1).equals("L")) {
                    cnt[i][0]++;
                } else if (findName.substring(j, j + 1).equals("O")) {
                    cnt[i][1]++;
                } else if (findName.substring(j, j + 1).equals("V")) {
                    cnt[i][2]++;
                } else if (findName.substring(j, j + 1).equals("E")) {
                    cnt[i][3]++;
                }
            }
            // ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) mod 100
            result[i] = ((cnt[i][0] + cnt[i][1]) * (cnt[i][0] + cnt[i][2]) * (cnt[i][0] + cnt[i][3])
                    * (cnt[i][1] + cnt[i][2]) * (cnt[i][1] + cnt[i][3]) * (cnt[i][2] + cnt[i][3])) % 100;
            // 최대값 확인
            if (result[i] > maxValue) {
                maxValue = result[i];
            }
        }

        // 최대값과 같은 값을 가지고 있는 이름을 추가
        for (i = 0; i < arr.length; i++) {
            if (result[i] == maxValue) {
                list.add(arr[i]);
            }
        }
        // 정렬 후 맨앞값 출력
        Collections.sort(list);
        System.out.println(list.get(0));
        sc.close();
    }
}