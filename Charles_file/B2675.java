package BaekJun;
import java.util.*;

public class B2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int test_case = sc.nextInt();
		
		for (int i = 1; i <= test_case; i++){
			int cases = sc.nextInt();
			String word = sc.next();
			for (int j = 0; j < word.length(); j++)
				for (int k = 1; k <= cases; k++)
					System.out.print(word.charAt(j));
			System.out.println("");
		}
	}

}
