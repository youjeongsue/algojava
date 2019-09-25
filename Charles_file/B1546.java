package BaekJun;
import java.util.*;

public class B1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int m = in.nextInt();
		double[] score = new double[m];
		double max_score = 0;
		double sum = 0;
		
		for (int i = 0; i < m; i++){
			int y = in.nextInt();
			score[i] = y;
			if (score[i] > max_score)
				max_score = score[i];
		}
		
		for (int i = 0; i< m; i++){
			score[i] = (score[i] / max_score) * 100;
			sum = sum + score[i];
		}
		System.out.println(sum / m);
	}
}
