import java.util.Scanner;

public class N1476{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt(), S = sc.nextInt(), M = sc.nextInt();
        int e = 1, s = 1, m = 1;
        int val = 0;
        while (true){
            val ++;
            if(E==e && S==s && M==m){
                System.out.println(val);
                break;
            }
            e++; s++; m++;
            if(e>15) e=1;
            if(s>28) s=1;
            if(m>19) m=1;
        }
        sc.close();
    }
}