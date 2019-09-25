package BaekJun;
import java.util.*;

public class B1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String [] day = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};		
		
		int x = in.nextInt();
		int y = in.nextInt();
		int count_day = 0;
		
		if (x == 1)
			System.out.println(day[(y % 7)]);
		else{
			for(int i = 0; i < x - 1; i++)
				count_day = count_day + month[i];
			count_day += y;
			System.out.println(day[count_day % 7]);
		}
	}

}
