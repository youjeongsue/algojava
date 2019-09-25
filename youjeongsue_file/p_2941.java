package bank_1946;

import java.util.Scanner;

public class p_2941 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
        int result = 0;

        String input = sc.next();
        int i = 0;
        while (input != "") {
            for (String croa : croatia) {
                // 남은 input의 길이가 1일때
                if (input.length() == 1) {
                    result++;
                    break;
                } else {
                    if (input.substring(i, i + 3) == croa) {
                        result++;
                        input = input.substring(i + 4);
                    }
                }
            }
        }
        System.out.print(result);
    }
}