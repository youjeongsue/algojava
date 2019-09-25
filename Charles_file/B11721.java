package BaekJun;
import java.util.*;

public class B11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String word = in.next();
		
		String[] array_word;
		
		array_word = word.split("");
	
		for (int i = 0; i < array_word.length; i++){
			System.out.print(array_word[i]);
			if (i % 10 == 9)
				System.out.print("\n");
		}
	}

}
