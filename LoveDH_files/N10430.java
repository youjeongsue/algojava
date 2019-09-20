// solution 1

// import java.util.Scanner;

// public class N10430{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(), b = sc.nextInt(), c=sc.nextInt();
//         System.out.println((a+b)%c);
//         System.out.println(((a%c)+(b%c))%c);
//         System.out.println(((a*b)%c));
//         System.out.println(((a%c)*(b%c))%c);
//         sc.close();
//     }
// }

// solution 2

import java.util.Scanner;

public class N10430{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0; i<3; i++){
            arr[i] = sc.nextInt();
        } 
        System.out.println((arr[0]+arr[1])%arr[2]);
        System.out.println(((arr[0]%arr[2])+(arr[1]%arr[2]))%arr[2]);
        System.out.println(((arr[0]*arr[1])%arr[2]));
        System.out.println(((arr[0]%arr[2])*(arr[1]%arr[2]))%arr[2]);
        sc.close();
    }
}