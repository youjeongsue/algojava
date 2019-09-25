import java.util.Scanner;

public class N2675 {
	public static void main(String[] args){
		char[] ch;
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for( int t=1; t<=test; t++){
			ch = sc.nextLine().toCharArray();
			int num = Integer.parseInt(String.valueOf(ch[0]));
			for(int i=2; i<ch.length; i++){
				char a = ch[i];
				for(int j=0; j<num; j++){
					System.out.print(a);
				}
			}
			System.out.println();
        }
        sc.close();
	}
}