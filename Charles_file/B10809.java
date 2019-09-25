package BaekJun;
import java.util.Scanner;
import java.util.Arrays;

public class B10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int[] alpha = new int[26];
		Arrays.fill(alpha, -1);
		
		for (int i = 0; i <word.length();i++){
			char single = word.charAt(i);
			int index = word.indexOf(single);
			
			alpha[single - 97] = index;
		}
		for (int j = 0; j < 26; j++)
			System.out.print(alpha[j]+ " ");
	}
}
