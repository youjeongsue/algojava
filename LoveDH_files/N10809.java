import java.util.Scanner;

public class N10809{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] val = new int[26];
        for (int i = 0; i<val.length; i++){
            val[i]=-1;
        }

        for (int i =0; i<str.length(); i++){
            int asc = str.charAt(i);
            if(val[asc-'a']==-1) val[asc-'a']=i;
        }

        for (int i=0; i<val.length; i++){
            System.out.print(val[i]+" ");
        }
        sc.close();
    }
}