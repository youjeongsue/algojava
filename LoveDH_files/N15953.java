import java.util.Scanner;

public class N15953 {

    public static int cal(int[] price, int[] place, int cont) {
        int top = 0;
        if (cont == 0)
            return 0;
        for (int tmp = 0; tmp < place.length; tmp++) {
            top += place[tmp];
            if (top >= cont)
                return price[tmp];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] answer = new int[testcase];
        int cont1, cont2;

        int[] cont1_price = { 500, 300, 200, 50, 30, 10 };
        int[] cont1_place = { 1, 2, 3, 4, 5, 6 };

        int[] cont2_price = { 512, 256, 128, 64, 32 };
        int[] cont2_place = { 1, 2, 4, 8, 16 };

        for (int round = 0; round < testcase; round++) {
            cont1 = sc.nextInt();
            cont2 = sc.nextInt();
            if (cont1 > 21)
                cont1 = 0;
            if (cont2 > 31)
                cont2 = 0;
            answer[round] = (cal(cont1_price, cont1_place, cont1) + cal(cont2_price, cont2_place, cont2)) * 10000;
        }

        for (int tmp = 0; tmp < testcase; tmp++)
            System.out.println(answer[tmp]);
        sc.close();
    }
}