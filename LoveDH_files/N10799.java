import java.util.ArrayList;
import java.util.Scanner;

public class N10799 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stick = sc.next();
        int ans = 0;

        ArrayList<Character> stack = new ArrayList<Character>();

        for (int i = 0; i < stick.length(); i++) {
            if (stick.charAt(i) == '(')
                stack.add('(');
            else {
                stack.remove(stack.size() - 1);
                if (stick.charAt(i - 1) == '(')
                    ans += stack.size();
                else
                    ans += 1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}