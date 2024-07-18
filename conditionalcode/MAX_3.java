
import java.util.Scanner;

public class MAX_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1 :");
        int a = sc.nextInt();
        System.out.println("Enter the 2 :");
        int b = sc.nextInt();
        System.out.println("Enter the 3 :");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a);
        }
        if(b>c && b >a){
            System.out.println(b);
        }
        if(c>a&&c>b){
            System.out.println(c);
        }
    }
}

