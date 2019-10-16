import java.util.Scanner;

public class N10828 {
    static Scanner sc = new Scanner(System.in);
    static int[] arr = new int[10000];
    static int curpos = -1;

    public static void push() {
        int tmp = sc.nextInt();
        curpos++;
        arr[curpos] = tmp;
    }

    public static void pop() {
        if (curpos == -1)
            System.out.println(-1);
        else
            System.out.println(arr[curpos--]);
    }

    public static void size() {
        System.out.println(curpos + 1);
    }

    public static void empty() {
        if (curpos == -1)
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static void top() {
        if (curpos == -1)
            System.out.println(-1);
        else
            System.out.println(arr[curpos]);
    }

    public static void main(String[] args) {

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            String command = sc.next();
            switch (command) {
            case "push":
                push();
                continue;
            case "pop":
                pop();
                continue;
            case "size":
                size();
                continue;
            case "empty":
                empty();
                continue;
            case "top":
                top();
                continue;
            }
        }
        sc.close();
    }
}