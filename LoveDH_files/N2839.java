import java.util.Scanner;

public class N2839{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = num/5;
        if (num==4 | num==7){
            System.out.println(-1);
            sc.close();
            return;
        }
        switch (num%5) {
            case (0):
                System.out.println(div);
                break;
            case (1):
                System.out.println(div+1);
                break;
            case (2):
                System.out.println(div+2);
                break;
            case (3):
                System.out.println(div+1);
                break;
            case (4):
                System.out.println(div+2);
                break;
        }
        sc.close();
    }
}