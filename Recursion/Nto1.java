
import java.util.Scanner;

public class Nto1 {

    public static void printN(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printN(n - 1);
   
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
    }
}
