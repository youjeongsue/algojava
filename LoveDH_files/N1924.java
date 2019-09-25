import java.util.Scanner;

public class N1924{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int mInput = sc.nextInt(), dInput = sc.nextInt();
        int daysum =0;
        for (int i = 0; i<(mInput-1) ; i++){
            daysum += days[i];
        }
        daysum += dInput;
        switch (daysum%7) {
            case (0):
                System.out.println("SUN");
                break;
            case (1):
                System.out.println("MON");
                break;
            case (2):
                System.out.println("TUE");
                break;
            case (3):
                System.out.println("WED");
                break;
            case (4):
                System.out.println("THU");
                break;
            case (5):
                System.out.println("FRI");
                break;
            case (6):
                System.out.println("SAT");
                break;
        }
        sc.close();
    }
}