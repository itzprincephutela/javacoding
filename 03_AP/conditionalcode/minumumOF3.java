
import java.util.Scanner;

public class minumumOF3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1 :");
        int a = sc.nextInt();
        System.out.println("Enter the 2 :");
        int b = sc.nextInt();
        System.out.println("Enter the 3 :");
        int c = sc.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.println(c + "is smallest");
            } else {
                System.out.println(b + "is smallest");
            }
        } else {
            if (a > c) {
                System.out.println(c + "is smallest");
            } else {
                System.out.println(a + "is smallest");
            }
        }
    }
}
