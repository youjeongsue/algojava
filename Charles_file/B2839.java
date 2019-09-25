package BaekJun;
import java.util.*;

public class B2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int five = N / 5;
		int three = 0;
		
		while (five >= 0){
			three = (N - five * 5) / 3;
			if (five * 5 + three * 3 == N){
				System.out.println(five + three);
				break;
			}
			else{
				five = five - 1;
			}
		}
		if (five * 5 + three * 3 != N)
			System.out.println(-1);	
		
	}
}
