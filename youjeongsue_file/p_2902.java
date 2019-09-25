//KMP는 왜 KMP일까?

package bank_1946;

import java.util.Scanner;

public class p_2902{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] split_input = input.split("-");
        String result = "";
        for(int i=0;i<split_input.length;i++){
            result+=split_input[i].charAt(0);
        }
        System.out.print(result);

        sc.close();
	}
}