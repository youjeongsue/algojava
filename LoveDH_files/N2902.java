import java.util.Scanner;

public class N2902{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split("-");
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i].toCharArray()[0]);
        }
        sc.close();
    }
}