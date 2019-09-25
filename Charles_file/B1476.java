package BaekJun;
import java.util.*;

public class B1476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int E = in.nextInt();
		int S = in.nextInt();
		int M = in.nextInt();
		int var_E = 1;
		int var_S = 1;
		int var_M = 1;
		int year = 1;
		
		while (true){
			if (var_E == E && var_S == S && var_M == M){
				break;
			}
			
			var_E += 1;
			var_S += 1;
			var_M += 1;
			
			if (var_E > 15)
				var_E = 1;
			
			if (var_S > 28)
				var_S = 1;
			
			if (var_M > 19)
				var_M = 1;
			
			year += 1;
		}
		System.out.println(year);

	}

}
