import java.util.*;

public class N2941{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        for(int i =0; i<croatia.length ; i++){
            input = input.replaceAll(croatia[i], ".");
        }
        System.out.println(input.length());
        sc.close();
    }
}