package BaekJun;
import java.util.*;

public class B4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int test_case = in.nextInt();

		
		for (int i = 1; i <= test_case; i++){
			int case_num_sum = 0;
			int rate_num_sum = 0;
			int rate_stu = 0;
			int case_num = in.nextInt();
			int[] case_num_list = new int[case_num];
			for (int j = 1; j <= case_num; j++){
				int case_num_value = in.nextInt();
				case_num_sum += case_num_value;
				case_num_list[j - 1] = case_num_value;
			}
			double avg = (double) case_num_sum / case_num;
			
			for (int k = 1; k <= case_num; k++){
				if (case_num_list[k - 1] > avg)
					rate_stu++;
			}
			System.out.printf("%.3f", 100.0 * rate_stu / case_num);
	        System.out.println("%");
		}
	}

}
