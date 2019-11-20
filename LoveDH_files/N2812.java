import java.util.Scanner;

public class N2812{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int total_radix = N-K;
        String num = sc.next();
        int[] radix = new int[N];
        for(int i=0; i<radix.length; i++){
            radix[i] = Character.getNumericValue((num.charAt(i)));
        }

        String ans = "";
        int curindx = 0;
        int max = -1;
        for(; total_radix>0; total_radix--){
            for(int i = curindx+1; i<N-total_radix; i++){
                int tmp = radix[i];
                if(tmp>=max) max = tmp;
            }
            ans += Integer.toString(max);
            curindx = num.indexOf(Integer.toString(max), curindx);
            max=-1;
        }

        System.out.println(Integer.parseInt(ans));
        sc.close();
    }
}