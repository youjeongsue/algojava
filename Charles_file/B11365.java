package BaekJun;
import java.util.*;

public class B11365 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		char[] list = new char[word.length()];
		
		for (int i = 0; i < word.length(); i++)
			list[i] = word.charAt(i);	
		System.out.println(list[1]);
	}
}
