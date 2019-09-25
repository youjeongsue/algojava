package BaekJun;
import java.util.*;

public class B2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String star = "*";
		
		for (int i = 1; i <= N; i++){
			System.out.println(star);
			star = star + "*";
		}
	}

}
