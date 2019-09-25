package BaekJun;
import java.util.*;

public class B11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		String line = in.next();
		int sum = 0;
		
		for (int i = 0; i < N; i++){
			int num = line.charAt(i) - '0';
			sum = sum + num;
		}
		System.out.println(sum);
	}

}
