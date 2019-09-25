package BaekJun;
import java.util.*;

public class B10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		
		int[] array_num = new int[n];
		
		for (int i = 1; i <= n; i++){
			int a = in.nextInt();
			array_num[i - 1] = a;
		}
		
		for (int i = 0; i < array_num.length; i++){
			if (array_num[i] < x){
				System.out.print(array_num[i] + " ");
			}
		}

	}

}
