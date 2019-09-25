package BaekJun;
import java.util.*;

public class B10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] nums = new int[3];

		
		for (int i = 0; i < nums.length; ++i){
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		System.out.println(nums[1]);
	}
}