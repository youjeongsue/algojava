import java.util.Scanner;

public class N11721{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int cnt = a.length()/10;

        for(int i=0; i<cnt+1; i++){
            if(i==cnt){
                System.out.println(a.substring(10*cnt));
                break;
            }
            System.out.println(a.substring(10*i, 10*(i+1)));
        }
        sc.close();
    }
}