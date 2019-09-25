import java.util.Scanner;

public class N10950{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] answer = new int[len];
        for(int i = 0; i<len; i++){
            answer[i] = sc.nextInt()+sc.nextInt();
        }
        for(int i = 0; i<len; i++){
            System.out.println(answer[i]);
        }
        sc.close();
    }
}