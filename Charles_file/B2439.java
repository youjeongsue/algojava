package BaekJun;
import java.util.*;

public class B2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String star = "*";
		String space = " ";
		
		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= N - i; j++){
				System.out.print(space);
			}
			System.out.println(star);
			star = star + "*";
		}
	}

}
