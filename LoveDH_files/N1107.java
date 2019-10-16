import java.util.*;

public class N1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int num = sc.nextInt();
        int[] expt = new int[10];
        for (int i = 0; i < num; i++) {
            expt[sc.nextInt()] = 1;
        }
        sc.close();

        int min = Math.abs(ch - 100);
        for (int i = 0; i <= 1000000; i++) {
            boolean can = true;
            int tmp = i;
            while (true) {
                if (expt[tmp % 10] == 1) {
                    can = false;
                    break;
                } else if (tmp / 10 == 0)
                    break;
                tmp /= 10;
            }
            if (can == false)
                continue;

            int push = String.valueOf(i).length() + Math.abs(ch - i);

            if (min >= push)
                min = push;
        }
        System.out.println(min);
    }
}